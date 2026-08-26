package me.vkryl.android.animator;

import androidx.recyclerview.widget.DiffUtil;

public final class VariableFloat {
    public float from;
    public float now;
    public float to;

    public VariableFloat(float f) {
        this.from = f;
        this.to = f;
        this.now = f;
    }

    public final boolean applyAnimation(float f) {
        float f2 = this.from;
        float fM = DiffUtil.m(this.to, f2, f, f2);
        if (this.now == fM) {
            return false;
        }
        this.now = fM;
        return true;
    }

    public final boolean differs(float f) {
        return this.to != f;
    }

    public final void finishAnimation(boolean z) {
        if (!z) {
            this.from = this.now;
            return;
        }
        float f = this.to;
        this.now = f;
        this.from = f;
    }
}
