package org.scilab.forge.jlatexmath;

import java.util.Map;

public class RotateAtom extends Atom {
    private double angle;
    private Atom base;
    private int option;
    private float x;
    private int xunit;
    private float y;
    private int yunit;

    public RotateAtom(Atom atom, double d, String str) {
        this.option = -1;
        this.type = atom.type;
        this.base = atom;
        this.angle = d;
        Map map = ParseOption.parseMap(str);
        if (map.containsKey("origin")) {
            this.option = RotateBox.getOrigin((String) map.get("origin"));
            return;
        }
        if (map.containsKey("x")) {
            float[] length = SpaceAtom.getLength((String) map.get("x"));
            this.xunit = (int) length[0];
            this.x = length[1];
        } else {
            this.xunit = 3;
            this.x = 0.0f;
        }
        if (map.containsKey("y")) {
            float[] length2 = SpaceAtom.getLength((String) map.get("y"));
            this.yunit = (int) length2[0];
            this.y = length2[1];
        } else {
            this.yunit = 3;
            this.y = 0.0f;
        }
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        if (this.option != -1) {
            return new RotateBox(this.base.createBox(teXEnvironment), this.angle, this.option);
        }
        return new RotateBox(this.base.createBox(teXEnvironment), this.angle, this.x * SpaceAtom.getFactor(this.xunit, teXEnvironment), this.y * SpaceAtom.getFactor(this.yunit, teXEnvironment));
    }
}
