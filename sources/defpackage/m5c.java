package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.TransformationMethod;
public final class m5c implements TextWatcher {
    public final byte a;
    public final p5c b;

    public m5c(p5c p5cVar, byte b) {
        this.a = b;
        this.b = p5cVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        p09 p09Var;
        byte b = this.a;
        p5c p5cVar = this.b;
        switch (b) {
            case 0:
                if (!p5cVar.N) {
                    byte b2 = p5cVar.P;
                    if (b2 == 0) {
                        p09 animatedDrawable = p5cVar.a.getAnimatedDrawable();
                        if (p5cVar.n.length() > 0) {
                            TransformationMethod transformationMethod = p5cVar.n.getTransformationMethod();
                            p09[] p09VarArr = p5cVar.g0;
                            if (transformationMethod == null) {
                                if (animatedDrawable != p09VarArr[3] && animatedDrawable != (p09Var = p09VarArr[5])) {
                                    p5cVar.a.setAnimation(p09Var);
                                    p5cVar.g0[5].O(false, 0.0f);
                                    p5cVar.a.d();
                                    return;
                                }
                                return;
                            } else if (animatedDrawable != p09VarArr[3]) {
                                p09 p09Var2 = p09VarArr[2];
                                if (animatedDrawable != p09Var2) {
                                    p5cVar.a.setAnimation(p09Var2);
                                    p5cVar.g0[2].K(49);
                                    p5cVar.g0[2].O(false, 0.0f);
                                    p5cVar.a.d();
                                    return;
                                } else if (p09Var2.b0 < 49) {
                                    p09Var2.K(49);
                                    return;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        if (animatedDrawable != p5cVar.g0[3] || p5cVar.n.getTransformationMethod() != null) {
                            p09[] p09VarArr2 = p5cVar.g0;
                            if (animatedDrawable != p09VarArr2[5]) {
                                p09VarArr2[2].K(-1);
                                p09 p09Var3 = p5cVar.g0[2];
                                if (animatedDrawable != p09Var3) {
                                    p5cVar.a.setAnimation(p09Var3);
                                    p5cVar.g0[2].I(49, false, false);
                                }
                                p5cVar.a.d();
                                return;
                            }
                        }
                        p5cVar.a.setAnimation(p5cVar.g0[4]);
                        p5cVar.g0[4].O(false, 0.0f);
                        p5cVar.a.d();
                        return;
                    } else if (b2 == 1) {
                        try {
                            p5cVar.g0[6].K((int) ((Math.min(1.0f, p5cVar.n.getLayout().getLineWidth(0) / p5cVar.n.getWidth()) * 142.0f) + 18.0f));
                            p5cVar.a.d();
                            return;
                        } catch (Exception e) {
                            fc4.g(e, true);
                            return;
                        }
                    } else if (b2 == 8 && editable.length() > 0) {
                        p5cVar.M0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                if (p5cVar.G) {
                    if (p5cVar.F.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        gm.T3(p5cVar.F, true, 0.1f, true, true);
                        return;
                    } else if (p5cVar.F.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        gm.T3(p5cVar.F, false, 0.1f, true, true);
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
