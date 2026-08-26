package me.vkryl.android.animator;

import android.graphics.RectF;

public final class VariableRect {
    public final RectF rectF = new RectF();
    public final VariableFloat left = new VariableFloat(0.0f);
    public final VariableFloat top = new VariableFloat(0.0f);
    public final VariableFloat right = new VariableFloat(0.0f);
    public final VariableFloat bottom = new VariableFloat(0.0f);

    public final boolean applyAnimation(float f) {
        return this.bottom.applyAnimation(f) || (this.right.applyAnimation(f) || (this.top.applyAnimation(f) || this.left.applyAnimation(f)));
    }

    public final boolean differs(float f, float f2, float f3, float f4) {
        return this.left.differs(f) || this.top.differs(f2) || this.right.differs(f3) || this.bottom.differs(f4);
    }

    public final void set(float f, float f2, float f3, float f4) {
        VariableFloat variableFloat = this.left;
        variableFloat.from = f;
        variableFloat.to = f;
        variableFloat.now = f;
        VariableFloat variableFloat2 = this.top;
        variableFloat2.from = f2;
        variableFloat2.to = f2;
        variableFloat2.now = f2;
        VariableFloat variableFloat3 = this.right;
        variableFloat3.from = f3;
        variableFloat3.to = f3;
        variableFloat3.now = f3;
        VariableFloat variableFloat4 = this.bottom;
        variableFloat4.from = f4;
        variableFloat4.to = f4;
        variableFloat4.now = f4;
    }
}
