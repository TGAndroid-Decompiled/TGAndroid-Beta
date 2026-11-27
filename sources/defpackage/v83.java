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
public final class v83 extends la {
    public final byte d;
    public final Object e;

    public v83(Object obj, byte b) {
        this.d = b;
        this.e = obj;
    }

    @Override
    public final boolean D(f89 f89Var) {
        switch (this.d) {
            case 0:
                s83 s83Var = (s83) ((x83) this.e).k3.get(f89Var.b());
                int i = s83Var.a;
                if (i == 5) {
                    return true;
                }
                if (i == 2 && s83Var.h != -1) {
                    return true;
                }
                return false;
            case 1:
                int i2 = f89Var.f;
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
                return ((x83) obj).k3.size();
            case 1:
                return ((q86) obj).s.size();
            default:
                return ((i49) obj).d.size();
        }
    }

    @Override
    public final int d(int i) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                return ((s83) ((x83) obj).k3.get(i)).a;
            case 1:
                ArrayList arrayList = ((q86) obj).s;
                if (i >= 0 && i < arrayList.size()) {
                    return ((k86) arrayList.get(i)).a;
                }
                return 2;
            default:
                return ((y39) ((i49) obj).d.get(i)).a;
        }
    }

    @Override
    public final void t(f89 f89Var, int i) {
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
                x83 x83Var = (x83) obj;
                ArrayList arrayList = x83Var.k3;
                int b2 = f89Var.b();
                View view = f89Var.a;
                s83 s83Var = (s83) arrayList.get(b2);
                int i3 = f89Var.f;
                if (i3 == 0) {
                    z51 z51Var = (z51) view;
                    if (x83Var.o3 != null) {
                        z51Var.e(x83Var.r3, x83Var.f3, x83Var.p3);
                    }
                    x83Var.f3 = false;
                    return;
                } else if (i3 == 1) {
                    ((z83) view).a.setText(s83Var.f);
                    return;
                } else if (i3 == 2) {
                    q83 q83Var = (q83) view;
                    int i4 = s83Var.d;
                    int i5 = s83Var.e;
                    int i6 = s83Var.c;
                    CharSequence charSequence = s83Var.f;
                    String str = s83Var.g;
                    int i7 = i + 1;
                    if (i7 < b() && ((s83) arrayList.get(i7)).a == i3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ImageView imageView = q83Var.a;
                    if (i6 == 0) {
                        imageView.setVisibility(8);
                    } else {
                        imageView.setVisibility(0);
                        boolean o = aob.I.o();
                        n57 n57Var = new n57((byte) 1);
                        n57Var.b(i4, i5);
                        n57Var.b = o;
                        imageView.setBackground(n57Var);
                        imageView.setImageResource(i6);
                    }
                    q83Var.b.setText(charSequence);
                    q83Var.d.setText(str);
                    q83Var.e = z;
                    q83Var.setWillNotDraw(!z);
                    int i8 = s83Var.h;
                    if (i8 >= 0) {
                        w83[] w83VarArr = x83Var.o3;
                        if (i8 >= w83VarArr.length || w83VarArr[i8].c > 0) {
                            bool = Boolean.valueOf(x83Var.q3[i8]);
                        }
                    }
                    ImageView imageView2 = q83Var.c;
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
                    animate.rotation(f).setDuration(360L).setInterpolator(k43.h).start();
                    return;
                } else if (i3 == 3) {
                    ((ilb) view).setText(s83Var.f);
                    return;
                } else if (i3 == 4) {
                    ((mf5) view).setText(s83Var.f);
                    return;
                } else if (i3 == 5) {
                    ((skb) view).k(s83Var.f.toString(), false);
                    return;
                } else if (i3 == 6) {
                    ((y83) view).setTop(true);
                    return;
                } else {
                    return;
                }
            case 1:
                ArrayList arrayList2 = ((q86) obj).s;
                if (i >= 0 && i < arrayList2.size()) {
                    k86 k86Var = (k86) arrayList2.get(i);
                    int i9 = f89Var.f;
                    View view2 = f89Var.a;
                    if (i9 == 0) {
                        ((mf5) view2).setText(k86Var.c);
                        return;
                    } else if (i9 == 1) {
                        ((o86) view2).a();
                        return;
                    } else if (i9 == 2) {
                        ilb ilbVar = (ilb) view2;
                        String str2 = k86Var.c;
                        if (TextUtils.isEmpty(str2)) {
                            ilbVar.setFixedSize(12);
                        } else {
                            ilbVar.setFixedSize(0);
                        }
                        ilbVar.setText(str2);
                        ilbVar.setContentDescription(str2);
                        ilbVar.setBackground(null);
                        return;
                    } else if (i9 != 3 && i9 != 4) {
                        if (i9 == 5) {
                            skb skbVar = (skb) view2;
                            if (k86Var.f) {
                                skbVar.l(k86Var.c, uc7.e1().getBoolean("view_animations", true), false);
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        int i10 = i + 1;
                        if (i10 < arrayList2.size() && ((k86) arrayList2.get(i10)).a != 2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        p86 p86Var = (p86) view2;
                        Switch r2 = p86Var.f;
                        ImageView imageView3 = p86Var.e;
                        in inVar = p86Var.d;
                        ImageView imageView4 = p86Var.a;
                        xb xbVar = p86Var.c;
                        int i11 = k86Var.a;
                        String str3 = k86Var.c;
                        int i12 = k86Var.e;
                        og2 og2Var = p86Var.h;
                        if (i11 == 3) {
                            og2Var.setVisibility(8);
                            imageView4.setVisibility(0);
                            imageView4.setImageResource(k86Var.d);
                            xbVar.setText(str3);
                            if (Integer.bitCount(i12) > 1) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            p86Var.w = z3;
                            if (z3) {
                                p86Var.c(k86Var, false);
                                inVar.setVisibility(0);
                                imageView3.setVisibility(0);
                            } else {
                                inVar.setVisibility(8);
                                imageView3.setVisibility(8);
                            }
                            xbVar.setTranslationX(0.0f);
                            r2.setVisibility(0);
                            r2.c(i86.e(i12), false);
                            if (Integer.bitCount(i12) > 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            p86Var.r = z4;
                        } else {
                            og2Var.setVisibility(0);
                            og2Var.a(i86.e(i12), false);
                            imageView4.setVisibility(8);
                            r2.setVisibility(8);
                            inVar.setVisibility(8);
                            imageView3.setVisibility(8);
                            xbVar.setText(str3);
                            float L = hl.L(41.0f);
                            if (ob6.a0) {
                                f2 = -2.2f;
                            } else {
                                f2 = 1.0f;
                            }
                            xbVar.setTranslationX(L * f2);
                            p86Var.w = false;
                            p86Var.r = false;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) p86Var.b.getLayoutParams();
                        if (k86Var.a == 3) {
                            if (ob6.a0) {
                                i2 = 64;
                            } else {
                                i2 = 75;
                            }
                            f3 = i2 + 4;
                        } else {
                            f3 = 8.0f;
                        }
                        marginLayoutParams.rightMargin = hl.L(f3);
                        p86Var.n = z2;
                        if (z2 || p86Var.r) {
                            z5 = false;
                        }
                        p86Var.setWillNotDraw(z5);
                        p86Var.b(i86.f(), false);
                        return;
                    }
                }
                return;
            default:
                int i13 = f89Var.f;
                if (i13 == 0 || i13 == 3) {
                    g49 g49Var = (g49) f89Var.a;
                    g49Var.setScaleX(1.0f);
                    g49Var.setScaleY(1.0f);
                    g49Var.d(i, ((y39) ((i49) obj).d.get(i)).c);
                    return;
                }
                return;
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        skb skbVar;
        View view;
        byte b = this.d;
        Object obj = this.e;
        View view2 = null;
        switch (b) {
            case 0:
                x83 x83Var = (x83) obj;
                vnb vnbVar = x83Var.o2;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    if (i != 6) {
                                        if (i != 7) {
                                            skbVar = new q83(x83Var.w3, x83Var.getContext());
                                        } else {
                                            View t62Var = new t62(x83Var.getContext(), (byte) 6);
                                            int i2 = aob.d6;
                                            int i3 = x83.x3;
                                            yob.h(i2, x83Var.o2, t62Var);
                                            skbVar = t62Var;
                                        }
                                    } else {
                                        ?? view3 = new View(x83Var.getContext());
                                        view3.a = new Path();
                                        Paint paint = new Paint(1);
                                        view3.b = paint;
                                        view3.c = true;
                                        paint.setShadowLayer(hl.L(1.0f), 0.0f, hl.L(-0.66f), 251658240);
                                        paint.setColor(aob.w0(null, aob.d6, false));
                                        skbVar = view3;
                                    }
                                } else {
                                    skb skbVar2 = new skb(x83Var.getContext());
                                    yob.W(skbVar2.getTextView(), aob.p7, vnbVar);
                                    yob.h(aob.d6, vnbVar, skbVar2);
                                    skbVar = skbVar2;
                                }
                            } else {
                                View mf5Var = new mf5(x83Var.getContext());
                                yob.h(aob.d6, vnbVar, mf5Var);
                                skbVar = mf5Var;
                            }
                        } else {
                            skbVar = new ilb(x83Var.getContext());
                        }
                    } else {
                        Context context = x83Var.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        yob.X(textView, aob.y6, null);
                        frameLayout.addView(textView, tre.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                        frameLayout.setTag(-33024);
                        skbVar = frameLayout;
                    }
                } else {
                    Context context2 = x83Var.getContext();
                    int[] iArr = a93.s;
                    u83 u83Var = new u83(this, context2, iArr.length, iArr, a93.w);
                    x83Var.v3 = u83Var;
                    u83Var.setInterceptTouch(false);
                    View view4 = x83Var.v3;
                    view4.setTag(-33024);
                    skbVar = view4;
                }
                return new f89(skbVar);
            case 1:
                q86 q86Var = (q86) obj;
                Context context3 = viewGroup.getContext();
                if (i == 0) {
                    view2 = new mf5(context3);
                } else if (i == 1) {
                    view2 = new o86(q86Var, context3);
                } else if (i == 2) {
                    view2 = new ilb(context3);
                } else if (i != 3 && i != 4) {
                    if (i == 5) {
                        view2 = new skb(23, null, context3, false, true);
                    }
                } else {
                    view2 = new p86(q86Var, context3);
                }
                return new f89(view2);
            default:
                i49 i49Var = (i49) obj;
                if (i != 1) {
                    if (i != 2) {
                        view = new g49(i49Var, i49Var.getContext());
                    } else {
                        i49Var.T = new tt(i49Var, i49Var.getContext());
                        i53 i53Var = new i53(i49Var, i49Var.getContext());
                        i49Var.w0 = i53Var;
                        i53Var.setImageResource(2131232330);
                        i49Var.w0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        byte b2 = i49Var.N0;
                        if (b2 != 1 && b2 != 2 && b2 != 4) {
                            yob.s(i49Var.w0, aob.h5, null, PorterDuff.Mode.MULTIPLY);
                        } else {
                            i49Var.w0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                        }
                        i53 i53Var2 = i49Var.w0;
                        int L = hl.L(28.0f);
                        int i4 = aob.i6;
                        yob.R(i53Var2, aob.h0(L, 0, vm2.o(aob.w0(null, i4, false), 40)), null, yob.g(i4, 40), null);
                        i49Var.w0.setPadding(hl.L(2.0f), hl.L(2.0f), hl.L(2.0f), hl.L(2.0f));
                        i49Var.w0.setContentDescription(ob6.M0(2131754879, null));
                        i49Var.T.addView(i49Var.w0, tre.e(30, 30, 17));
                        i49Var.w0.setOnClickListener(new View.OnClickListener(this) {
                            public final v83 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onClick(View view5) {
                                byte b3 = r2;
                                v83 v83Var = this.b;
                                switch (b3) {
                                    case 0:
                                        view5.getLocationOnScreen(new int[2]);
                                        view5.getMeasuredWidth();
                                        view5.getMeasuredHeight();
                                        new xk8(((i49) v83Var.e).u0, 4, true).show();
                                        return;
                                    default:
                                        ((i49) v83Var.e).o();
                                        return;
                                }
                            }
                        });
                        view = i49Var.T;
                    }
                } else {
                    i49Var.S = new FrameLayout(i49Var.getContext());
                    cl8 cl8Var = new cl8(0, null, i49Var.getContext());
                    i49Var.v0 = cl8Var;
                    int w0 = aob.w0(null, aob.F8, false);
                    int i5 = aob.h5;
                    cl8Var.setColor(vm2.f(0.7f, w0, aob.w0(null, i5, false)));
                    yob.s(i49Var.v0, i5, null, PorterDuff.Mode.MULTIPLY);
                    i49Var.v0.setScaleX(0.0f);
                    i49Var.v0.setScaleY(0.0f);
                    i49Var.v0.setPadding(hl.L(1.0f), hl.L(1.0f), hl.L(1.0f), hl.L(1.0f));
                    i49Var.S.addView(i49Var.v0, tre.e(26, 26, 17));
                    i49Var.v0.setOnClickListener(new View.OnClickListener(this) {
                        public final v83 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view5) {
                            byte b3 = r2;
                            v83 v83Var = this.b;
                            switch (b3) {
                                case 0:
                                    view5.getLocationOnScreen(new int[2]);
                                    view5.getMeasuredWidth();
                                    view5.getMeasuredHeight();
                                    new xk8(((i49) v83Var.e).u0, 4, true).show();
                                    return;
                                default:
                                    ((i49) v83Var.e).o();
                                    return;
                            }
                        }
                    });
                    view = i49Var.S;
                }
                int topOffset = ((i49Var.getLayoutParams().height - ((int) i49Var.getTopOffset())) - i49Var.getPaddingTop()) - i49Var.getPaddingBottom();
                view.setLayoutParams(new r79(topOffset - hl.L(12.0f), topOffset));
                return new f89(view);
        }
    }

    @Override
    public final void y(f89 f89Var) {
        int b;
        switch (this.d) {
            case 2:
                ArrayList arrayList = ((i49) this.e).d;
                int i = f89Var.f;
                if ((i == 0 || i == 3) && (b = f89Var.b()) >= 0 && b < arrayList.size()) {
                    ((g49) f89Var.a).f(((y39) arrayList.get(b)).c, false);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
