package me.vkryl.android.animator;

public class VariableFloat {
    private float from;
    private float now;
    private float to;

    public VariableFloat(float f) {
        set(f);
    }

    public void set(float f) {
        this.from = f;
        this.to = f;
        this.now = f;
    }

    public float get() {
        return this.now;
    }

    public void setFrom(float f) {
        this.from = f;
    }

    public void setTo(float f) {
        this.to = f;
    }

    public boolean differs(float f) {
        return this.to != f;
    }

    public void finishAnimation(boolean z) {
        if (z) {
            float f = this.to;
            this.now = f;
            this.from = f;
            return;
        }
        this.from = this.now;
    }

    public boolean applyAnimation(float f) {
        float f2 = this.from;
        float f3 = f2 + ((this.to - f2) * f);
        if (this.now == f3) {
            return false;
        }
        this.now = f3;
        return true;
    }
}
