package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.TransformationMethod;
public final class l7c implements TextWatcher {
    public final byte a;
    public final o7c b;

    public l7c(o7c o7cVar, byte b) {
        this.a = b;
        this.b = o7cVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        b29 b29Var;
        byte b = this.a;
        o7c o7cVar = this.b;
        switch (b) {
            case 0:
                if (!o7cVar.N) {
                    byte b2 = o7cVar.P;
                    if (b2 == 0) {
                        b29 animatedDrawable = o7cVar.a.getAnimatedDrawable();
                        if (o7cVar.n.length() > 0) {
                            TransformationMethod transformationMethod = o7cVar.n.getTransformationMethod();
                            b29[] b29VarArr = o7cVar.g0;
                            if (transformationMethod == null) {
                                if (animatedDrawable != b29VarArr[3] && animatedDrawable != (b29Var = b29VarArr[5])) {
                                    o7cVar.a.setAnimation(b29Var);
                                    o7cVar.g0[5].O(false, 0.0f);
                                    o7cVar.a.d();
                                    return;
                                }
                                return;
                            } else if (animatedDrawable != b29VarArr[3]) {
                                b29 b29Var2 = b29VarArr[2];
                                if (animatedDrawable != b29Var2) {
                                    o7cVar.a.setAnimation(b29Var2);
                                    o7cVar.g0[2].K(49);
                                    o7cVar.g0[2].O(false, 0.0f);
                                    o7cVar.a.d();
                                    return;
                                } else if (b29Var2.b0 < 49) {
                                    b29Var2.K(49);
                                    return;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        if (animatedDrawable != o7cVar.g0[3] || o7cVar.n.getTransformationMethod() != null) {
                            b29[] b29VarArr2 = o7cVar.g0;
                            if (animatedDrawable != b29VarArr2[5]) {
                                b29VarArr2[2].K(-1);
                                b29 b29Var3 = o7cVar.g0[2];
                                if (animatedDrawable != b29Var3) {
                                    o7cVar.a.setAnimation(b29Var3);
                                    o7cVar.g0[2].I(49, false, false);
                                }
                                o7cVar.a.d();
                                return;
                            }
                        }
                        o7cVar.a.setAnimation(o7cVar.g0[4]);
                        o7cVar.g0[4].O(false, 0.0f);
                        o7cVar.a.d();
                        return;
                    } else if (b2 == 1) {
                        try {
                            o7cVar.g0[6].K((int) ((Math.min(1.0f, o7cVar.n.getLayout().getLineWidth(0) / o7cVar.n.getWidth()) * 142.0f) + 18.0f));
                            o7cVar.a.d();
                            return;
                        } catch (Exception e) {
                            cc4.g(e, true);
                            return;
                        }
                    } else if (b2 == 8 && editable.length() > 0) {
                        o7cVar.M0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                if (o7cVar.G) {
                    if (o7cVar.F.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        hl.T3(o7cVar.F, true, 0.1f, true, true);
                        return;
                    } else if (o7cVar.F.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        hl.T3(o7cVar.F, false, 0.1f, true, true);
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
