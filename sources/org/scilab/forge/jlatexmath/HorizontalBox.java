package org.scilab.forge.jlatexmath;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import ru.noties.jlatexmath.awt.Color;
import ru.noties.jlatexmath.awt.Graphics2D;

public class HorizontalBox extends Box {
    protected List<Integer> breakPositions;
    private float curPos;

    public HorizontalBox(Box box, float f10, int i10) {
        this.curPos = 0.0f;
        if (f10 == Float.POSITIVE_INFINITY) {
            add(box);
            return;
        }
        float width = f10 - box.getWidth();
        if (width <= 0.0f) {
            add(box);
            return;
        }
        if (i10 == 2 || i10 == 5) {
            StrutBox strutBox = new StrutBox(width / 2.0f, 0.0f, 0.0f, 0.0f);
            add(strutBox);
            add(box);
            add(strutBox);
            return;
        }
        if (i10 == 0) {
            add(box);
            add(new StrutBox(width, 0.0f, 0.0f, 0.0f));
        } else if (i10 != 1) {
            add(box);
        } else {
            add(new StrutBox(width, 0.0f, 0.0f, 0.0f));
            add(box);
        }
    }

    private void recalculate(Box box) {
        this.width = box.getWidth() + this.width;
        this.height = Math.max(this.children.size() == 0 ? Float.NEGATIVE_INFINITY : this.height, box.height - box.shift);
        this.depth = Math.max(this.children.size() != 0 ? this.depth : Float.NEGATIVE_INFINITY, box.depth + box.shift);
    }

    @Override
    public final void add(Box box) {
        recalculate(box);
        super.add(box);
    }

    public void addBreakPosition(int i10) {
        if (this.breakPositions == null) {
            this.breakPositions = new ArrayList();
        }
        this.breakPositions.add(Integer.valueOf(i10));
    }

    public HorizontalBox cloneBox() {
        HorizontalBox horizontalBox = new HorizontalBox(this.foreground, this.background);
        horizontalBox.shift = this.shift;
        return horizontalBox;
    }

    @Override
    public void draw(Graphics2D graphics2D, float f10, float f11) {
        startDraw(graphics2D, f10, f11);
        for (Box box : this.children) {
            box.draw(graphics2D, f10, box.shift + f11);
            f10 += box.getWidth();
        }
        endDraw(graphics2D);
    }

    @Override
    public int getLastFontId() {
        LinkedList<Box> linkedList = this.children;
        ListIterator<Box> listIterator = linkedList.listIterator(linkedList.size());
        int lastFontId = -1;
        while (lastFontId == -1 && listIterator.hasPrevious()) {
            lastFontId = listIterator.previous().getLastFontId();
        }
        return lastFontId;
    }

    public HorizontalBox[] split(int i10) {
        return split(i10, 1);
    }

    public HorizontalBox[] splitRemove(int i10) {
        return split(i10, 2);
    }

    private HorizontalBox[] split(int i10, int i11) {
        HorizontalBox horizontalBoxCloneBox = cloneBox();
        HorizontalBox horizontalBoxCloneBox2 = cloneBox();
        for (int i12 = 0; i12 <= i10; i12++) {
            horizontalBoxCloneBox.add(this.children.get(i12));
        }
        for (int i13 = i11 + i10; i13 < this.children.size(); i13++) {
            horizontalBoxCloneBox2.add(this.children.get(i13));
        }
        if (this.breakPositions != null) {
            for (int i14 = 0; i14 < this.breakPositions.size(); i14++) {
                if (this.breakPositions.get(i14).intValue() > i10 + 1) {
                    horizontalBoxCloneBox2.addBreakPosition((this.breakPositions.get(i14).intValue() - i10) - 1);
                }
            }
        }
        return new HorizontalBox[]{horizontalBoxCloneBox, horizontalBoxCloneBox2};
    }

    @Override
    public final void add(int i10, Box box) {
        recalculate(box);
        super.add(i10, box);
    }

    public HorizontalBox(Box box) {
        this.curPos = 0.0f;
        add(box);
    }

    public HorizontalBox() {
        this.curPos = 0.0f;
    }

    public HorizontalBox(Color color, Color color2) {
        super(color, color2);
        this.curPos = 0.0f;
    }
}
