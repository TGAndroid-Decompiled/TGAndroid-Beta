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

    public HorizontalBox(Box box, float f, int i) {
        this.curPos = 0.0f;
        if (f == Float.POSITIVE_INFINITY) {
            add(box);
            return;
        }
        float width = f - box.getWidth();
        if (width <= 0.0f) {
            add(box);
            return;
        }
        if (i == 2 || i == 5) {
            StrutBox strutBox = new StrutBox(width / 2.0f, 0.0f, 0.0f, 0.0f);
            add(strutBox);
            add(box);
            add(strutBox);
            return;
        }
        if (i == 0) {
            add(box);
            add(new StrutBox(width, 0.0f, 0.0f, 0.0f));
        } else if (i != 1) {
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

    public void addBreakPosition(int i) {
        if (this.breakPositions == null) {
            this.breakPositions = new ArrayList();
        }
        this.breakPositions.add(Integer.valueOf(i));
    }

    public HorizontalBox cloneBox() {
        HorizontalBox horizontalBox = new HorizontalBox(this.foreground, this.background);
        horizontalBox.shift = this.shift;
        return horizontalBox;
    }

    @Override
    public void draw(Graphics2D graphics2D, float f, float f2) {
        startDraw(graphics2D, f, f2);
        for (Box box : this.children) {
            box.draw(graphics2D, f, box.shift + f2);
            f += box.getWidth();
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

    public HorizontalBox[] split(int i) {
        return split(i, 1);
    }

    public HorizontalBox[] splitRemove(int i) {
        return split(i, 2);
    }

    private HorizontalBox[] split(int i, int i2) {
        HorizontalBox horizontalBoxCloneBox = cloneBox();
        HorizontalBox horizontalBoxCloneBox2 = cloneBox();
        for (int i3 = 0; i3 <= i; i3++) {
            horizontalBoxCloneBox.add(this.children.get(i3));
        }
        for (int i4 = i2 + i; i4 < this.children.size(); i4++) {
            horizontalBoxCloneBox2.add(this.children.get(i4));
        }
        if (this.breakPositions != null) {
            for (int i5 = 0; i5 < this.breakPositions.size(); i5++) {
                if (this.breakPositions.get(i5).intValue() > i + 1) {
                    horizontalBoxCloneBox2.addBreakPosition((this.breakPositions.get(i5).intValue() - i) - 1);
                }
            }
        }
        return new HorizontalBox[]{horizontalBoxCloneBox, horizontalBoxCloneBox2};
    }

    @Override
    public final void add(int i, Box box) {
        recalculate(box);
        super.add(i, box);
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
