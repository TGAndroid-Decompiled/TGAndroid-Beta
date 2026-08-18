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

    public VerticalBox(Box box, float f, int i) {
        this();
        add(box);
        if (i == 2) {
            float f2 = f / 2.0f;
            StrutBox strutBox = new StrutBox(0.0f, f2, 0.0f, 0.0f);
            super.add(0, strutBox);
            this.height += f2;
            this.depth += f2;
            super.add(strutBox);
            return;
        }
        if (i == 3) {
            this.depth += f;
            super.add(new StrutBox(0.0f, f, 0.0f, 0.0f));
        } else if (i == 4) {
            this.height += f;
            super.add(0, new StrutBox(0.0f, f, 0.0f, 0.0f));
        }
    }

    @Override
    public final void add(Box box) {
        super.add(box);
        if (this.children.size() == 1) {
            this.height = box.height;
            this.depth = box.depth;
        } else {
            this.depth += box.height + box.depth;
        }
        recalculateWidth(box);
    }

    public final void add(Box box, float f) {
        if (this.children.size() >= 1) {
            add(new StrutBox(0.0f, f, 0.0f, 0.0f));
        }
        add(box);
    }

    private void recalculateWidth(Box box) {
        this.leftMostPos = Math.min(this.leftMostPos, box.shift);
        float f = this.rightMostPos;
        float f2 = box.shift;
        float f3 = box.width;
        if (f3 <= 0.0f) {
            f3 = 0.0f;
        }
        float fMax = Math.max(f, f2 + f3);
        this.rightMostPos = fMax;
        this.width = fMax - this.leftMostPos;
    }

    @Override
    public void add(int i, Box box) {
        super.add(i, box);
        if (i == 0) {
            this.depth += box.depth + this.height;
            this.height = box.height;
        } else {
            this.depth += box.height + box.depth;
        }
        recalculateWidth(box);
    }

    @Override
    public void draw(Graphics2D graphics2D, float f, float f2) {
        float depth = f2 - this.height;
        for (Box box : this.children) {
            float height = depth + box.getHeight();
            box.draw(graphics2D, (box.getShift() + f) - this.leftMostPos, height);
            depth = height + box.getDepth();
        }
    }

    public int getSize() {
        return this.children.size();
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
}
