package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.TransformationMethod;
public final class m3c implements TextWatcher {
    public final byte a;
    public final p3c b;

    public m3c(p3c p3cVar, byte b) {
        this.a = b;
        this.b = p3cVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        oy8 oy8Var;
        byte b = this.a;
        p3c p3cVar = this.b;
        switch (b) {
            case 0:
                if (!p3cVar.N) {
                    byte b2 = p3cVar.P;
                    if (b2 == 0) {
                        oy8 animatedDrawable = p3cVar.a.getAnimatedDrawable();
                        if (p3cVar.n.length() > 0) {
                            TransformationMethod transformationMethod = p3cVar.n.getTransformationMethod();
                            oy8[] oy8VarArr = p3cVar.g0;
                            if (transformationMethod == null) {
                                if (animatedDrawable != oy8VarArr[3] && animatedDrawable != (oy8Var = oy8VarArr[5])) {
                                    p3cVar.a.setAnimation(oy8Var);
                                    p3cVar.g0[5].O(false, 0.0f);
                                    p3cVar.a.d();
                                    return;
                                }
                                return;
                            } else if (animatedDrawable != oy8VarArr[3]) {
                                oy8 oy8Var2 = oy8VarArr[2];
                                if (animatedDrawable != oy8Var2) {
                                    p3cVar.a.setAnimation(oy8Var2);
                                    p3cVar.g0[2].K(49);
                                    p3cVar.g0[2].O(false, 0.0f);
                                    p3cVar.a.d();
                                    return;
                                } else if (oy8Var2.b0 < 49) {
                                    oy8Var2.K(49);
                                    return;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        if (animatedDrawable != p3cVar.g0[3] || p3cVar.n.getTransformationMethod() != null) {
                            oy8[] oy8VarArr2 = p3cVar.g0;
                            if (animatedDrawable != oy8VarArr2[5]) {
                                oy8VarArr2[2].K(-1);
                                oy8 oy8Var3 = p3cVar.g0[2];
                                if (animatedDrawable != oy8Var3) {
                                    p3cVar.a.setAnimation(oy8Var3);
                                    p3cVar.g0[2].I(49, false, false);
                                }
                                p3cVar.a.d();
                                return;
                            }
                        }
                        p3cVar.a.setAnimation(p3cVar.g0[4]);
                        p3cVar.g0[4].O(false, 0.0f);
                        p3cVar.a.d();
                        return;
                    } else if (b2 == 1) {
                        try {
                            p3cVar.g0[6].K((int) ((Math.min(1.0f, p3cVar.n.getLayout().getLineWidth(0) / p3cVar.n.getWidth()) * 142.0f) + 18.0f));
                            p3cVar.a.d();
                            return;
                        } catch (Exception e) {
                            fa4.g(e, true);
                            return;
                        }
                    } else if (b2 == 8 && editable.length() > 0) {
                        p3cVar.L0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                if (p3cVar.G) {
                    if (p3cVar.F.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        gl.T3(p3cVar.F, true, 0.1f, true, true);
                        return;
                    } else if (p3cVar.F.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        gl.T3(p3cVar.F, false, 0.1f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }
}
