package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.Components.Switch;
public final class o93 extends ka {
    public final byte d;
    public final Object e;

    public o93(Object obj, byte b) {
        this.d = b;
        this.e = obj;
    }

    @Override
    public final boolean D(u69 u69Var) {
        switch (this.d) {
            case 0:
                l93 l93Var = (l93) ((q93) this.e).k3.get(u69Var.b());
                int i = l93Var.a;
                if (i == 5) {
                    return true;
                }
                if (i == 2 && l93Var.h != -1) {
                    return true;
                }
                return false;
            case 1:
                int i2 = u69Var.f;
                if (i2 == 4 || i2 == 3 || i2 == 5) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    @Override
    public final int b() {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                return ((q93) obj).k3.size();
            case 1:
                return ((m86) obj).s.size();
            default:
                return ((v29) obj).d.size();
        }
    }

    @Override
    public final int d(int i) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                return ((l93) ((q93) obj).k3.get(i)).a;
            case 1:
                ArrayList arrayList = ((m86) obj).s;
                if (i >= 0 && i < arrayList.size()) {
                    return ((g86) arrayList.get(i)).a;
                }
                return 2;
            default:
                return ((l29) ((v29) obj).d.get(i)).a;
        }
    }

    @Override
    public final void t(u69 u69Var, int i) {
        boolean z;
        float f;
        boolean z2;
        float f2;
        float f3;
        int i2;
        boolean z3;
        boolean z4;
        byte b = this.d;
        Boolean bool = null;
        boolean z5 = true;
        Object obj = this.e;
        switch (b) {
            case 0:
                q93 q93Var = (q93) obj;
                ArrayList arrayList = q93Var.k3;
                int b2 = u69Var.b();
                View view = u69Var.a;
                l93 l93Var = (l93) arrayList.get(b2);
                int i3 = u69Var.f;
                if (i3 == 0) {
                    y61 y61Var = (y61) view;
                    if (q93Var.o3 != null) {
                        y61Var.e(q93Var.r3, q93Var.f3, q93Var.p3);
                    }
                    q93Var.f3 = false;
                    return;
                } else if (i3 == 1) {
                    ((s93) view).a.setText(l93Var.f);
                    return;
                } else if (i3 == 2) {
                    j93 j93Var = (j93) view;
                    int i4 = l93Var.d;
                    int i5 = l93Var.e;
                    int i6 = l93Var.c;
                    CharSequence charSequence = l93Var.f;
                    String str = l93Var.g;
                    int i7 = i + 1;
                    if (i7 < b() && ((l93) arrayList.get(i7)).a == i3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ImageView imageView = j93Var.a;
                    if (i6 == 0) {
                        imageView.setVisibility(8);
                    } else {
                        imageView.setVisibility(0);
                        boolean o = cmb.I.o();
                        g57 g57Var = new g57((byte) 1);
                        g57Var.b(i4, i5);
                        g57Var.b = o;
                        imageView.setBackground(g57Var);
                        imageView.setImageResource(i6);
                    }
                    j93Var.b.setText(charSequence);
                    j93Var.d.setText(str);
                    j93Var.e = z;
                    j93Var.setWillNotDraw(!z);
                    int i8 = l93Var.h;
                    if (i8 >= 0) {
                        p93[] p93VarArr = q93Var.o3;
                        if (i8 >= p93VarArr.length || p93VarArr[i8].c > 0) {
                            bool = Boolean.valueOf(q93Var.q3[i8]);
                        }
                    }
                    ImageView imageView2 = j93Var.c;
                    if (bool == null) {
                        imageView2.setVisibility(8);
                        return;
                    }
                    imageView2.setVisibility(0);
                    ViewPropertyAnimator animate = imageView2.animate();
                    if (bool.booleanValue()) {
                        f = 0.0f;
                    } else {
                        f = 180.0f;
                    }
                    animate.rotation(f).setDuration(360L).setInterpolator(d53.h).start();
                    return;
                } else if (i3 == 3) {
                    ((njb) view).setText(l93Var.f);
                    return;
                } else if (i3 == 4) {
                    ((jf5) view).setText(l93Var.f);
                    return;
                } else if (i3 == 5) {
                    ((xib) view).k(l93Var.f.toString(), false);
                    return;
                } else if (i3 == 6) {
                    ((r93) view).setTop(true);
                    return;
                } else {
                    return;
                }
            case 1:
                ArrayList arrayList2 = ((m86) obj).s;
                if (i >= 0 && i < arrayList2.size()) {
                    g86 g86Var = (g86) arrayList2.get(i);
                    int i9 = u69Var.f;
                    View view2 = u69Var.a;
                    if (i9 == 0) {
                        ((jf5) view2).setText(g86Var.c);
                        return;
                    } else if (i9 == 1) {
                        ((k86) view2).a();
                        return;
                    } else if (i9 == 2) {
                        njb njbVar = (njb) view2;
                        String str2 = g86Var.c;
                        if (TextUtils.isEmpty(str2)) {
                            njbVar.setFixedSize(12);
                        } else {
                            njbVar.setFixedSize(0);
                        }
                        njbVar.setText(str2);
                        njbVar.setContentDescription(str2);
                        njbVar.setBackground(null);
                        return;
                    } else if (i9 != 3 && i9 != 4) {
                        if (i9 == 5) {
                            xib xibVar = (xib) view2;
                            if (g86Var.f) {
                                xibVar.l(g86Var.c, oc7.d1().getBoolean("view_animations", true), false);
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        int i10 = i + 1;
                        if (i10 < arrayList2.size() && ((g86) arrayList2.get(i10)).a != 2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        l86 l86Var = (l86) view2;
                        Switch r2 = l86Var.f;
                        ImageView imageView3 = l86Var.e;
                        io ioVar = l86Var.d;
                        ImageView imageView4 = l86Var.a;
                        wb wbVar = l86Var.c;
                        int i11 = g86Var.a;
                        String str3 = g86Var.c;
                        int i12 = g86Var.e;
                        jh2 jh2Var = l86Var.h;
                        if (i11 == 3) {
                            jh2Var.setVisibility(8);
                            imageView4.setVisibility(0);
                            imageView4.setImageResource(g86Var.d);
                            wbVar.setText(str3);
                            if (Integer.bitCount(i12) > 1) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            l86Var.w = z3;
                            if (z3) {
                                l86Var.c(g86Var, false);
                                ioVar.setVisibility(0);
                                imageView3.setVisibility(0);
                            } else {
                                ioVar.setVisibility(8);
                                imageView3.setVisibility(8);
                            }
                            wbVar.setTranslationX(0.0f);
                            r2.setVisibility(0);
                            r2.c(e86.e(i12), false);
                            if (Integer.bitCount(i12) > 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            l86Var.r = z4;
                        } else {
                            jh2Var.setVisibility(0);
                            jh2Var.a(e86.e(i12), false);
                            imageView4.setVisibility(8);
                            r2.setVisibility(8);
                            ioVar.setVisibility(8);
                            imageView3.setVisibility(8);
                            wbVar.setText(str3);
                            float L = gm.L(41.0f);
                            if (jb6.a0) {
                                f2 = -2.2f;
                            } else {
                                f2 = 1.0f;
                            }
                            wbVar.setTranslationX(L * f2);
                            l86Var.w = false;
                            l86Var.r = false;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) l86Var.b.getLayoutParams();
                        if (g86Var.a == 3) {
                            if (jb6.a0) {
                                i2 = 64;
                            } else {
                                i2 = 75;
                            }
                            f3 = i2 + 4;
                        } else {
                            f3 = 8.0f;
                        }
                        marginLayoutParams.rightMargin = gm.L(f3);
                        l86Var.n = z2;
                        if (z2 || l86Var.r) {
                            z5 = false;
                        }
                        l86Var.setWillNotDraw(z5);
                        l86Var.b(e86.f(), false);
                        return;
                    }
                }
                return;
            default:
                int i13 = u69Var.f;
                if (i13 == 0 || i13 == 3) {
                    t29 t29Var = (t29) u69Var.a;
                    t29Var.setScaleX(1.0f);
                    t29Var.setScaleY(1.0f);
                    t29Var.d(i, ((l29) ((v29) obj).d.get(i)).c);
                    return;
                }
                return;
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        xib xibVar;
        View view;
        byte b = this.d;
        Object obj = this.e;
        View view2 = null;
        switch (b) {
            case 0:
                q93 q93Var = (q93) obj;
                ylb ylbVar = q93Var.o2;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    if (i != 6) {
                                        if (i != 7) {
                                            xibVar = new j93(q93Var.w3, q93Var.getContext());
                                        } else {
                                            View o72Var = new o72(q93Var.getContext(), (byte) 6);
                                            int i2 = cmb.c6;
                                            int i3 = q93.x3;
                                            anb.h(i2, q93Var.o2, o72Var);
                                            xibVar = o72Var;
                                        }
                                    } else {
                                        ?? view3 = new View(q93Var.getContext());
                                        view3.a = new Path();
                                        Paint paint = new Paint(1);
                                        view3.b = paint;
                                        view3.c = true;
                                        paint.setShadowLayer(gm.L(1.0f), 0.0f, gm.L(-0.66f), 251658240);
                                        paint.setColor(cmb.w0(null, cmb.c6, false));
                                        xibVar = view3;
                                    }
                                } else {
                                    xib xibVar2 = new xib(q93Var.getContext());
                                    anb.W(xibVar2.getTextView(), cmb.o7, ylbVar);
                                    anb.h(cmb.c6, ylbVar, xibVar2);
                                    xibVar = xibVar2;
                                }
                            } else {
                                View jf5Var = new jf5(q93Var.getContext());
                                anb.h(cmb.c6, ylbVar, jf5Var);
                                xibVar = jf5Var;
                            }
                        } else {
                            xibVar = new njb(q93Var.getContext());
                        }
                    } else {
                        Context context = q93Var.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        anb.X(textView, cmb.x6, null);
                        frameLayout.addView(textView, qoe.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                        frameLayout.setTag(-33024);
                        xibVar = frameLayout;
                    }
                } else {
                    Context context2 = q93Var.getContext();
                    int[] iArr = t93.s;
                    n93 n93Var = new n93(this, context2, iArr.length, iArr, t93.w);
                    q93Var.v3 = n93Var;
                    n93Var.setInterceptTouch(false);
                    View view4 = q93Var.v3;
                    view4.setTag(-33024);
                    xibVar = view4;
                }
                return new u69(xibVar);
            case 1:
                m86 m86Var = (m86) obj;
                Context context3 = viewGroup.getContext();
                if (i == 0) {
                    view2 = new jf5(context3);
                } else if (i == 1) {
                    view2 = new k86(m86Var, context3);
                } else if (i == 2) {
                    view2 = new njb(context3);
                } else if (i != 3 && i != 4) {
                    if (i == 5) {
                        view2 = new xib(23, null, context3, false, true);
                    }
                } else {
                    view2 = new l86(m86Var, context3);
                }
                return new u69(view2);
            default:
                v29 v29Var = (v29) obj;
                if (i != 1) {
                    if (i != 2) {
                        view = new t29(v29Var, v29Var.getContext());
                    } else {
                        v29Var.T = new su(v29Var, v29Var.getContext());
                        b63 b63Var = new b63(v29Var, v29Var.getContext());
                        v29Var.w0 = b63Var;
                        b63Var.setImageResource(2131232331);
                        v29Var.w0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        byte b2 = v29Var.N0;
                        if (b2 != 1 && b2 != 2 && b2 != 4) {
                            anb.s(v29Var.w0, cmb.g5, null, PorterDuff.Mode.MULTIPLY);
                        } else {
                            v29Var.w0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                        }
                        b63 b63Var2 = v29Var.w0;
                        int L = gm.L(28.0f);
                        int i4 = cmb.h6;
                        anb.R(b63Var2, cmb.h0(L, 0, on2.p(cmb.w0(null, i4, false), 40)), null, anb.g(i4, 40), null);
                        v29Var.w0.setPadding(gm.L(2.0f), gm.L(2.0f), gm.L(2.0f), gm.L(2.0f));
                        v29Var.w0.setContentDescription(jb6.M0(2131754883, null));
                        v29Var.T.addView(v29Var.w0, qoe.e(30, 30, 17));
                        v29Var.w0.setOnClickListener(new View.OnClickListener(this) {
                            public final o93 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onClick(View view5) {
                                byte b3 = r2;
                                o93 o93Var = this.b;
                                switch (b3) {
                                    case 0:
                                        view5.getLocationOnScreen(new int[2]);
                                        view5.getMeasuredWidth();
                                        view5.getMeasuredHeight();
                                        new kj8(((v29) o93Var.e).u0, 4, true).show();
                                        return;
                                    default:
                                        ((v29) o93Var.e).o();
                                        return;
                                }
                            }
                        });
                        view = v29Var.T;
                    }
                } else {
                    v29Var.S = new FrameLayout(v29Var.getContext());
                    pj8 pj8Var = new pj8(0, null, v29Var.getContext());
                    v29Var.v0 = pj8Var;
                    int w0 = cmb.w0(null, cmb.E8, false);
                    int i5 = cmb.g5;
                    pj8Var.setColor(on2.f(0.7f, w0, cmb.w0(null, i5, false)));
                    anb.s(v29Var.v0, i5, null, PorterDuff.Mode.MULTIPLY);
                    v29Var.v0.setScaleX(0.0f);
                    v29Var.v0.setScaleY(0.0f);
                    v29Var.v0.setPadding(gm.L(1.0f), gm.L(1.0f), gm.L(1.0f), gm.L(1.0f));
                    v29Var.S.addView(v29Var.v0, qoe.e(26, 26, 17));
                    v29Var.v0.setOnClickListener(new View.OnClickListener(this) {
                        public final o93 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view5) {
                            byte b3 = r2;
                            o93 o93Var = this.b;
                            switch (b3) {
                                case 0:
                                    view5.getLocationOnScreen(new int[2]);
                                    view5.getMeasuredWidth();
                                    view5.getMeasuredHeight();
                                    new kj8(((v29) o93Var.e).u0, 4, true).show();
                                    return;
                                default:
                                    ((v29) o93Var.e).o();
                                    return;
                            }
                        }
                    });
                    view = v29Var.S;
                }
                int topOffset = ((v29Var.getLayoutParams().height - ((int) v29Var.getTopOffset())) - v29Var.getPaddingTop()) - v29Var.getPaddingBottom();
                view.setLayoutParams(new g69(topOffset - gm.L(12.0f), topOffset));
                return new u69(view);
        }
    }

    @Override
    public final void y(u69 u69Var) {
        int b;
        switch (this.d) {
            case 2:
                ArrayList arrayList = ((v29) this.e).d;
                int i = u69Var.f;
                if ((i == 0 || i == 3) && (b = u69Var.b()) >= 0 && b < arrayList.size()) {
                    ((t29) u69Var.a).f(((l29) arrayList.get(b)).c, false);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
