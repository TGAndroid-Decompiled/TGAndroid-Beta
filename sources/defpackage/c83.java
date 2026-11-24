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
public final class c83 extends ka {
    public final byte d;
    public final Object e;

    public c83(Object obj, byte b) {
        this.d = b;
        this.e = obj;
    }

    @Override
    public final boolean D(s49 s49Var) {
        switch (this.d) {
            case 0:
                z73 z73Var = (z73) ((e83) this.e).k3.get(s49Var.b());
                int i = z73Var.a;
                if (i == 5) {
                    return true;
                }
                if (i == 2 && z73Var.h != -1) {
                    return true;
                }
                return false;
            case 1:
                int i2 = s49Var.f;
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
                return ((e83) obj).k3.size();
            case 1:
                return ((m66) obj).s.size();
            default:
                return ((t09) obj).d.size();
        }
    }

    @Override
    public final int d(int i) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                return ((z73) ((e83) obj).k3.get(i)).a;
            case 1:
                ArrayList arrayList = ((m66) obj).s;
                if (i >= 0 && i < arrayList.size()) {
                    return ((g66) arrayList.get(i)).a;
                }
                return 2;
            default:
                return ((k09) ((t09) obj).d.get(i)).a;
        }
    }

    @Override
    public final void t(s49 s49Var, int i) {
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
                e83 e83Var = (e83) obj;
                ArrayList arrayList = e83Var.k3;
                int b2 = s49Var.b();
                View view = s49Var.a;
                z73 z73Var = (z73) arrayList.get(b2);
                int i3 = s49Var.f;
                if (i3 == 0) {
                    r51 r51Var = (r51) view;
                    if (e83Var.o3 != null) {
                        r51Var.e(e83Var.r3, e83Var.f3, e83Var.p3);
                    }
                    e83Var.f3 = false;
                    return;
                } else if (i3 == 1) {
                    ((g83) view).a.setText(z73Var.f);
                    return;
                } else if (i3 == 2) {
                    x73 x73Var = (x73) view;
                    int i4 = z73Var.d;
                    int i5 = z73Var.e;
                    int i6 = z73Var.c;
                    CharSequence charSequence = z73Var.f;
                    String str = z73Var.g;
                    int i7 = i + 1;
                    if (i7 < b() && ((z73) arrayList.get(i7)).a == i3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ImageView imageView = x73Var.a;
                    if (i6 == 0) {
                        imageView.setVisibility(8);
                    } else {
                        imageView.setVisibility(0);
                        boolean o = bkb.I.o();
                        g37 g37Var = new g37((byte) 1);
                        g37Var.b(i4, i5);
                        g37Var.b = o;
                        imageView.setBackground(g37Var);
                        imageView.setImageResource(i6);
                    }
                    x73Var.b.setText(charSequence);
                    x73Var.d.setText(str);
                    x73Var.e = z;
                    x73Var.setWillNotDraw(!z);
                    int i8 = z73Var.h;
                    if (i8 >= 0) {
                        d83[] d83VarArr = e83Var.o3;
                        if (i8 >= d83VarArr.length || d83VarArr[i8].c > 0) {
                            bool = Boolean.valueOf(e83Var.q3[i8]);
                        }
                    }
                    ImageView imageView2 = x73Var.c;
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
                    animate.rotation(f).setDuration(360L).setInterpolator(s33.h).start();
                    return;
                } else if (i3 == 3) {
                    ((mhb) view).setText(z73Var.f);
                    return;
                } else if (i3 == 4) {
                    ((ld5) view).setText(z73Var.f);
                    return;
                } else if (i3 == 5) {
                    ((wgb) view).k(z73Var.f.toString(), false);
                    return;
                } else if (i3 == 6) {
                    ((f83) view).setTop(true);
                    return;
                } else {
                    return;
                }
            case 1:
                ArrayList arrayList2 = ((m66) obj).s;
                if (i >= 0 && i < arrayList2.size()) {
                    g66 g66Var = (g66) arrayList2.get(i);
                    int i9 = s49Var.f;
                    View view2 = s49Var.a;
                    if (i9 == 0) {
                        ((ld5) view2).setText(g66Var.c);
                        return;
                    } else if (i9 == 1) {
                        ((k66) view2).a();
                        return;
                    } else if (i9 == 2) {
                        mhb mhbVar = (mhb) view2;
                        String str2 = g66Var.c;
                        if (TextUtils.isEmpty(str2)) {
                            mhbVar.setFixedSize(12);
                        } else {
                            mhbVar.setFixedSize(0);
                        }
                        mhbVar.setText(str2);
                        mhbVar.setContentDescription(str2);
                        mhbVar.setBackground(null);
                        return;
                    } else if (i9 != 3 && i9 != 4) {
                        if (i9 == 5) {
                            wgb wgbVar = (wgb) view2;
                            if (g66Var.f) {
                                wgbVar.l(g66Var.c, na7.c1().getBoolean("view_animations", true), false);
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        int i10 = i + 1;
                        if (i10 < arrayList2.size() && ((g66) arrayList2.get(i10)).a != 2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        l66 l66Var = (l66) view2;
                        Switch r2 = l66Var.f;
                        ImageView imageView3 = l66Var.e;
                        hn hnVar = l66Var.d;
                        ImageView imageView4 = l66Var.a;
                        wb wbVar = l66Var.c;
                        int i11 = g66Var.a;
                        String str3 = g66Var.c;
                        int i12 = g66Var.e;
                        wf2 wf2Var = l66Var.h;
                        if (i11 == 3) {
                            wf2Var.setVisibility(8);
                            imageView4.setVisibility(0);
                            imageView4.setImageResource(g66Var.d);
                            wbVar.setText(str3);
                            if (Integer.bitCount(i12) > 1) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            l66Var.w = z3;
                            if (z3) {
                                l66Var.c(g66Var, false);
                                hnVar.setVisibility(0);
                                imageView3.setVisibility(0);
                            } else {
                                hnVar.setVisibility(8);
                                imageView3.setVisibility(8);
                            }
                            wbVar.setTranslationX(0.0f);
                            r2.setVisibility(0);
                            r2.c(e66.e(i12), false);
                            if (Integer.bitCount(i12) > 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            l66Var.r = z4;
                        } else {
                            wf2Var.setVisibility(0);
                            wf2Var.a(e66.e(i12), false);
                            imageView4.setVisibility(8);
                            r2.setVisibility(8);
                            hnVar.setVisibility(8);
                            imageView3.setVisibility(8);
                            wbVar.setText(str3);
                            float L = gl.L(41.0f);
                            if (k96.a0) {
                                f2 = -2.2f;
                            } else {
                                f2 = 1.0f;
                            }
                            wbVar.setTranslationX(L * f2);
                            l66Var.w = false;
                            l66Var.r = false;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) l66Var.b.getLayoutParams();
                        if (g66Var.a == 3) {
                            if (k96.a0) {
                                i2 = 64;
                            } else {
                                i2 = 75;
                            }
                            f3 = i2 + 4;
                        } else {
                            f3 = 8.0f;
                        }
                        marginLayoutParams.rightMargin = gl.L(f3);
                        l66Var.n = z2;
                        if (z2 || l66Var.r) {
                            z5 = false;
                        }
                        l66Var.setWillNotDraw(z5);
                        l66Var.b(e66.f(), false);
                        return;
                    }
                }
                return;
            default:
                int i13 = s49Var.f;
                if (i13 == 0 || i13 == 3) {
                    r09 r09Var = (r09) s49Var.a;
                    r09Var.setScaleX(1.0f);
                    r09Var.setScaleY(1.0f);
                    r09Var.d(i, ((k09) ((t09) obj).d.get(i)).c);
                    return;
                }
                return;
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        wgb wgbVar;
        View view;
        byte b = this.d;
        Object obj = this.e;
        View view2 = null;
        switch (b) {
            case 0:
                e83 e83Var = (e83) obj;
                wjb wjbVar = e83Var.o2;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    if (i != 6) {
                                        if (i != 7) {
                                            wgbVar = new x73(e83Var.w3, e83Var.getContext());
                                        } else {
                                            View d62Var = new d62(e83Var.getContext(), (byte) 6);
                                            int i2 = bkb.c6;
                                            int i3 = e83.x3;
                                            zkb.h(i2, e83Var.o2, d62Var);
                                            wgbVar = d62Var;
                                        }
                                    } else {
                                        ?? view3 = new View(e83Var.getContext());
                                        view3.a = new Path();
                                        Paint paint = new Paint(1);
                                        view3.b = paint;
                                        view3.c = true;
                                        paint.setShadowLayer(gl.L(1.0f), 0.0f, gl.L(-0.66f), 251658240);
                                        paint.setColor(bkb.w0(null, bkb.c6, false));
                                        wgbVar = view3;
                                    }
                                } else {
                                    wgb wgbVar2 = new wgb(e83Var.getContext());
                                    zkb.W(wgbVar2.getTextView(), bkb.o7, wjbVar);
                                    zkb.h(bkb.c6, wjbVar, wgbVar2);
                                    wgbVar = wgbVar2;
                                }
                            } else {
                                View ld5Var = new ld5(e83Var.getContext());
                                zkb.h(bkb.c6, wjbVar, ld5Var);
                                wgbVar = ld5Var;
                            }
                        } else {
                            wgbVar = new mhb(e83Var.getContext());
                        }
                    } else {
                        Context context = e83Var.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        zkb.X(textView, bkb.x6, null);
                        frameLayout.addView(textView, nme.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                        frameLayout.setTag(-33024);
                        wgbVar = frameLayout;
                    }
                } else {
                    Context context2 = e83Var.getContext();
                    int[] iArr = h83.s;
                    b83 b83Var = new b83(this, context2, iArr.length, iArr, h83.w);
                    e83Var.v3 = b83Var;
                    b83Var.setInterceptTouch(false);
                    View view4 = e83Var.v3;
                    view4.setTag(-33024);
                    wgbVar = view4;
                }
                return new s49(wgbVar);
            case 1:
                m66 m66Var = (m66) obj;
                Context context3 = viewGroup.getContext();
                if (i == 0) {
                    view2 = new ld5(context3);
                } else if (i == 1) {
                    view2 = new k66(m66Var, context3);
                } else if (i == 2) {
                    view2 = new mhb(context3);
                } else if (i != 3 && i != 4) {
                    if (i == 5) {
                        view2 = new wgb(23, null, context3, false, true);
                    }
                } else {
                    view2 = new l66(m66Var, context3);
                }
                return new s49(view2);
            default:
                t09 t09Var = (t09) obj;
                if (i != 1) {
                    if (i != 2) {
                        view = new r09(t09Var, t09Var.getContext());
                    } else {
                        t09Var.T = new st(t09Var, t09Var.getContext());
                        q43 q43Var = new q43(t09Var, t09Var.getContext());
                        t09Var.w0 = q43Var;
                        q43Var.setImageResource(2131232330);
                        t09Var.w0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        byte b2 = t09Var.N0;
                        if (b2 != 1 && b2 != 2 && b2 != 4) {
                            zkb.s(t09Var.w0, bkb.g5, null, PorterDuff.Mode.MULTIPLY);
                        } else {
                            t09Var.w0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                        }
                        q43 q43Var2 = t09Var.w0;
                        int L = gl.L(28.0f);
                        int i4 = bkb.h6;
                        zkb.R(q43Var2, bkb.h0(L, 0, bm2.o(bkb.w0(null, i4, false), 40)), null, zkb.g(i4, 40), null);
                        t09Var.w0.setPadding(gl.L(2.0f), gl.L(2.0f), gl.L(2.0f), gl.L(2.0f));
                        t09Var.w0.setContentDescription(k96.M0(2131754883, null));
                        t09Var.T.addView(t09Var.w0, nme.e(30, 30, 17));
                        t09Var.w0.setOnClickListener(new View.OnClickListener(this) {
                            public final c83 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onClick(View view5) {
                                byte b3 = r2;
                                c83 c83Var = this.b;
                                switch (b3) {
                                    case 0:
                                        view5.getLocationOnScreen(new int[2]);
                                        view5.getMeasuredWidth();
                                        view5.getMeasuredHeight();
                                        new jh8(((t09) c83Var.e).u0, 4, true).show();
                                        return;
                                    default:
                                        ((t09) c83Var.e).o();
                                        return;
                                }
                            }
                        });
                        view = t09Var.T;
                    }
                } else {
                    t09Var.S = new FrameLayout(t09Var.getContext());
                    oh8 oh8Var = new oh8(0, null, t09Var.getContext());
                    t09Var.v0 = oh8Var;
                    int w0 = bkb.w0(null, bkb.E8, false);
                    int i5 = bkb.g5;
                    oh8Var.setColor(bm2.f(0.7f, w0, bkb.w0(null, i5, false)));
                    zkb.s(t09Var.v0, i5, null, PorterDuff.Mode.MULTIPLY);
                    t09Var.v0.setScaleX(0.0f);
                    t09Var.v0.setScaleY(0.0f);
                    t09Var.v0.setPadding(gl.L(1.0f), gl.L(1.0f), gl.L(1.0f), gl.L(1.0f));
                    t09Var.S.addView(t09Var.v0, nme.e(26, 26, 17));
                    t09Var.v0.setOnClickListener(new View.OnClickListener(this) {
                        public final c83 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view5) {
                            byte b3 = r2;
                            c83 c83Var = this.b;
                            switch (b3) {
                                case 0:
                                    view5.getLocationOnScreen(new int[2]);
                                    view5.getMeasuredWidth();
                                    view5.getMeasuredHeight();
                                    new jh8(((t09) c83Var.e).u0, 4, true).show();
                                    return;
                                default:
                                    ((t09) c83Var.e).o();
                                    return;
                            }
                        }
                    });
                    view = t09Var.S;
                }
                int topOffset = ((t09Var.getLayoutParams().height - ((int) t09Var.getTopOffset())) - t09Var.getPaddingTop()) - t09Var.getPaddingBottom();
                view.setLayoutParams(new e49(topOffset - gl.L(12.0f), topOffset));
                return new s49(view);
        }
    }

    @Override
    public final void y(s49 s49Var) {
        int b;
        switch (this.d) {
            case 2:
                ArrayList arrayList = ((t09) this.e).d;
                int i = s49Var.f;
                if ((i == 0 || i == 3) && (b = s49Var.b()) >= 0 && b < arrayList.size()) {
                    ((r09) s49Var.a).f(((k09) arrayList.get(b)).c, false);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
