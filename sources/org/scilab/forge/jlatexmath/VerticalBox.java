package org.scilab.forge.jlatexmath;

import java.util.LinkedList;
import java.util.ListIterator;
import ru.noties.jlatexmath.awt.Graphics2D;

class VerticalBox extends Box {
    private float leftMostPos;
    private float rightMostPos;

    public VerticalBox() {
        this.leftMostPos = Float.MAX_VALUE;
        this.rightMostPos = -3.4028235E38f;
    }

    private void recalculateWidth(Box box) {
        this.leftMostPos = Math.min(this.leftMostPos, box.shift);
        float f10 = this.rightMostPos;
        float f11 = box.shift;
        float f12 = box.width;
        if (f12 <= 0.0f) {
            f12 = 0.0f;
        }
        float fMax = Math.max(f10, f11 + f12);
        this.rightMostPos = fMax;
        this.width = fMax - this.leftMostPos;
    }

    @Override
    public final void add(Box box) {
        super.add(box);
        if (this.children.size() == 1) {
            this.height = box.height;
            this.depth = box.depth;
        } else {
            this.depth = box.height + box.depth + this.depth;
        }
        recalculateWidth(box);
    }

    @Override
    public void draw(Graphics2D graphics2D, float f10, float f11) {
        float depth = f11 - this.height;
        for (Box box : this.children) {
            float height = box.getHeight() + depth;
            box.draw(graphics2D, (box.getShift() + f10) - this.leftMostPos, height);
            depth = box.getDepth() + height;
        }
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

    public int getSize() {
        return this.children.size();
    }

    public VerticalBox(Box box, float f10, int i10) {
        this();
        add(box);
        if (i10 == 2) {
            float f11 = f10 / 2.0f;
            StrutBox strutBox = new StrutBox(0.0f, f11, 0.0f, 0.0f);
            super.add(0, strutBox);
            this.height += f11;
            this.depth += f11;
            super.add(strutBox);
            return;
        }
        if (i10 == 3) {
            this.depth += f10;
            super.add(new StrutBox(0.0f, f10, 0.0f, 0.0f));
        } else if (i10 == 4) {
            this.height += f10;
            super.add(0, new StrutBox(0.0f, f10, 0.0f, 0.0f));
        }
    }

    public final void add(Box box, float f10) {
        if (this.children.size() >= 1) {
            add(new StrutBox(0.0f, f10, 0.0f, 0.0f));
        }
        add(box);
    }

    @Override
    public void add(int i10, Box box) {
        super.add(i10, box);
        if (i10 == 0) {
            this.depth = box.depth + this.height + this.depth;
            this.height = box.height;
        } else {
            this.depth = box.height + box.depth + this.depth;
        }
        recalculateWidth(box);
    }
}
