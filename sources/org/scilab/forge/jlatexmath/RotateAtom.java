package org.scilab.forge.jlatexmath;

import java.util.Map;

public class RotateAtom extends Atom {
    private double angle;
    private Atom base;
    private int option;

    private float f19599x;
    private int xunit;

    private float f19600y;
    private int yunit;

    public RotateAtom(Atom atom, String str, String str2) {
        this.option = -1;
        this.type = atom.type;
        this.base = atom;
        this.angle = Double.parseDouble(str);
        this.option = RotateBox.getOrigin(str2);
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        if (this.option != -1) {
            return new RotateBox(this.base.createBox(teXEnvironment), this.angle, this.option);
        }
        return new RotateBox(this.base.createBox(teXEnvironment), this.angle, SpaceAtom.getFactor(this.xunit, teXEnvironment) * this.f19599x, SpaceAtom.getFactor(this.yunit, teXEnvironment) * this.f19600y);
    }

    public RotateAtom(Atom atom, double d, String str) {
        this.option = -1;
        this.type = atom.type;
        this.base = atom;
        this.angle = d;
        Map<String, String> map = ParseOption.parseMap(str);
        if (map.containsKey("origin")) {
            this.option = RotateBox.getOrigin(map.get("origin"));
            return;
        }
        if (map.containsKey("x")) {
            float[] length = SpaceAtom.getLength(map.get("x"));
            this.xunit = (int) length[0];
            this.f19599x = length[1];
        } else {
            this.xunit = 3;
            this.f19599x = 0.0f;
        }
        if (map.containsKey("y")) {
            float[] length2 = SpaceAtom.getLength(map.get("y"));
            this.yunit = (int) length2[0];
            this.f19600y = length2[1];
        } else {
            this.yunit = 3;
            this.f19600y = 0.0f;
        }
    }
}
