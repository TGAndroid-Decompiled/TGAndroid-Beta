package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class w71 extends ka {
    public final byte d;
    public final Context e;
    public final d f;

    public w71(d dVar, Context context, byte b) {
        this.d = b;
        this.f = dVar;
        this.e = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i;
        switch (this.d) {
            case 0:
                y71 y71Var = (y71) this.f;
                if (u69Var.b() != y71Var.K && (((i = u69Var.f) != 2 || y71Var.H <= 0 || y71Var.L) && i != 5 && i != 7 && i != 11)) {
                    return false;
                }
                return true;
            default:
                int i2 = u69Var.f;
                if (i2 == 0 || i2 == 4) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int b() {
        byte b = this.d;
        d dVar = this.f;
        switch (b) {
            case 0:
                return ((y71) dVar).g0.size();
            default:
                return ((NotificationsCustomSettingsActivity) dVar).J.size();
        }
    }

    @Override
    public final int d(int i) {
        byte b = this.d;
        d dVar = this.f;
        switch (b) {
            case 0:
                return ((u71) ((y71) dVar).g0.get(i)).a;
            default:
                ArrayList arrayList = ((NotificationsCustomSettingsActivity) dVar).J;
                if (i >= 0 && i < arrayList.size()) {
                    return ((uo7) arrayList.get(i)).a;
                }
                return 5;
        }
    }

    @Override
    public final void t(u69 u69Var, int i) {
        int i2;
        String str;
        xib xibVar;
        float f;
        float f2;
        boolean z;
        String format;
        boolean z2;
        Boolean bool;
        boolean z3;
        float f3;
        byte b = this.d;
        d dVar = this.f;
        boolean z4 = true;
        switch (b) {
            case 0:
                y71 y71Var = (y71) dVar;
                ArrayList arrayList = y71Var.g0;
                u71 u71Var = (u71) arrayList.get(i);
                int i3 = u69Var.f;
                View view = u69Var.a;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 7) {
                                    switch (i3) {
                                        case 9:
                                            y71Var.y0();
                                            return;
                                        case 10:
                                            m71 m71Var = y71Var.Y;
                                            if (m71Var != null && !y71Var.L) {
                                                long j = y71Var.H;
                                                if (j <= 0) {
                                                    z4 = false;
                                                }
                                                long j2 = y71Var.I;
                                                int i4 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                                                if (i4 <= 0) {
                                                    f = 0.0f;
                                                } else {
                                                    f = ((float) j) / ((float) j2);
                                                }
                                                long j3 = y71Var.J;
                                                if (j3 > 0 && i4 > 0) {
                                                    f2 = ((float) (j2 - j3)) / ((float) j2);
                                                } else {
                                                    f2 = 0.0f;
                                                }
                                                m71Var.b(f, f2, z4);
                                                return;
                                            }
                                            return;
                                        case 11:
                                            oh2 oh2Var = (oh2) view;
                                            int i5 = u71Var.f;
                                            if (i5 < 0) {
                                                z = y71Var.o0();
                                            } else {
                                                z = y71Var.d[i5];
                                            }
                                            boolean z5 = z;
                                            String str2 = u71Var.d;
                                            int[] iArr = y71Var.V;
                                            int i6 = u71Var.f;
                                            if (i6 < 0) {
                                                i6 = 9;
                                            }
                                            int i7 = iArr[i6];
                                            if (i7 <= 0) {
                                                format = String.format("<%.1f%%", Float.valueOf(1.0f));
                                            } else {
                                                format = String.format("%d%%", Integer.valueOf(i7));
                                            }
                                            SpannableString spannableString = new SpannableString(format);
                                            spannableString.setSpan(new RelativeSizeSpan(0.834f), 0, spannableString.length(), 33);
                                            spannableString.setSpan(new z5c(gm.o()), 0, spannableString.length(), 33);
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                                            spannableStringBuilder.append((CharSequence) "  ");
                                            spannableStringBuilder.append((CharSequence) spannableString);
                                            String i0 = gm.i0(u71Var.g, false, false);
                                            if (u71Var.f >= 0 ? !u71Var.j : !y71Var.M) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            oh2Var.e(spannableStringBuilder, i0, z5, z2, false);
                                            int i8 = u71Var.h;
                                            int i9 = cmb.j7;
                                            jh2 jh2Var = oh2Var.r;
                                            if (jh2Var != null) {
                                                jh2Var.b(i8, i8, i9);
                                            }
                                            if (u71Var.f < 0) {
                                                bool = Boolean.valueOf(y71Var.M);
                                            } else {
                                                bool = null;
                                            }
                                            oh2Var.setCollapsed(bool);
                                            if (u71Var.f == -1) {
                                                oh2Var.d(new j1(this, (byte) 29), new t(this, oh2Var, (byte) 27));
                                            } else {
                                                oh2Var.d(null, null);
                                            }
                                            oh2Var.setPad(u71Var.i ? 1 : 0);
                                            return;
                                        default:
                                            return;
                                    }
                                }
                                xib xibVar2 = (xib) view;
                                v61 v61Var = y71Var.getMessagesController().h4;
                                int i10 = u71Var.c;
                                int size = v61Var.d(((u71) arrayList.get(i)).c).size();
                                if (size > 0) {
                                    str = jb6.G(size, "ExceptionShort", Integer.valueOf(size));
                                } else {
                                    str = null;
                                }
                                String f4 = v61.f(v61Var.c(i10));
                                if (((u71) arrayList.get(i)).c == 0) {
                                    xibVar = xibVar2;
                                    xibVar.r(jb6.M0(2131746488, null), f4, true, 2131232155, -11565578, -13276952, true);
                                } else {
                                    xibVar = xibVar2;
                                    if (((u71) arrayList.get(i)).c == 1) {
                                        xibVar.r(jb6.M0(2131749214, null), f4, true, 2131232154, -11154873, -14175180, true);
                                    } else if (((u71) arrayList.get(i)).c == 2) {
                                        xibVar.r(jb6.M0(2131752603, null), f4, true, 2131232153, -1007845, -1996271, true);
                                    } else if (((u71) arrayList.get(i)).c == 3) {
                                        xibVar.r(jb6.M0(2131752599, null), f4, false, 2131232160, -765355, -2148011, false);
                                    }
                                }
                                xibVar.setSubtitle(str);
                                return;
                            }
                            jf5 jf5Var = (jf5) view;
                            jf5Var.setText(((u71) arrayList.get(i)).d);
                            ((u71) arrayList.get(i)).getClass();
                            jf5Var.setTopMargin(15);
                            ((u71) arrayList.get(i)).getClass();
                            jf5Var.setBottomMargin(0);
                            return;
                        }
                        final j3b j3bVar = (j3b) view;
                        boolean z6 = y71Var.L;
                        long j4 = y71Var.e;
                        long j5 = y71Var.H;
                        long j6 = y71Var.J;
                        long j7 = y71Var.I;
                        yh4 yh4Var = j3bVar.J;
                        View view2 = j3bVar.x;
                        TextView textView = j3bVar.n;
                        TextView textView2 = j3bVar.h;
                        TextView textView3 = j3bVar.w;
                        vkb vkbVar = j3bVar.E;
                        j3bVar.e = z6;
                        TextView textView4 = j3bVar.r;
                        textView4.setText(jb6.a0("TotalDeviceFreeSize", null, 2131743660, gm.i0(j6, false, false)));
                        TextView textView5 = j3bVar.s;
                        long j8 = j7 - j6;
                        textView5.setText(jb6.a0("TotalDeviceSize", null, 2131743659, gm.i0(j8, false, false)));
                        if (z6) {
                            textView3.setVisibility(0);
                            textView2.setVisibility(8);
                            textView4.setVisibility(8);
                            textView5.setVisibility(8);
                            textView.setVisibility(8);
                            view2.setVisibility(8);
                            vkbVar.setVisibility(8);
                            j3bVar.F = 0.0f;
                            j3bVar.G = 0.0f;
                            if (yh4Var != null) {
                                yh4Var.d(textView3);
                            }
                        } else {
                            if (yh4Var != null) {
                                yh4Var.F(textView3);
                            }
                            textView3.setVisibility(8);
                            if (j5 > 0) {
                                i2 = 0;
                                view2.setVisibility(0);
                                vkbVar.setVisibility(0);
                                textView2.setVisibility(0);
                                textView.setVisibility(8);
                                vkbVar.c(jb6.M0(2131751984, null), gm.i0(j5, false, false), false, true);
                                textView2.setText(jb6.a0("TelegramCacheSize", null, 2131743931, gm.i0(j5 + j4, false, false)));
                            } else {
                                i2 = 0;
                                textView2.setVisibility(8);
                                textView.setVisibility(0);
                                textView.setText(jb6.a0("LocalDatabaseSize", null, 2131748526, gm.i0(j4, false, false)));
                                view2.setVisibility(8);
                                vkbVar.setVisibility(8);
                            }
                            textView4.setVisibility(i2);
                            textView5.setVisibility(i2);
                            float f5 = (float) j7;
                            float f6 = ((float) (j5 + j4)) / f5;
                            float f7 = ((float) j8) / f5;
                            if (j3bVar.F != f6) {
                                ValueAnimator valueAnimator = j3bVar.H;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                }
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(j3bVar.F, f6);
                                j3bVar.H = ofFloat;
                                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    @Override
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                        byte b2 = r2;
                                        j3b j3bVar2 = j3bVar;
                                        j3bVar2.getClass();
                                        switch (b2) {
                                            case 0:
                                                j3bVar2.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                                j3bVar2.invalidate();
                                                return;
                                            default:
                                                j3bVar2.G = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                                j3bVar2.invalidate();
                                                return;
                                        }
                                    }
                                });
                                j3bVar.H.start();
                            }
                            if (j3bVar.G != f7) {
                                ValueAnimator valueAnimator2 = j3bVar.I;
                                if (valueAnimator2 != null) {
                                    valueAnimator2.cancel();
                                }
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(j3bVar.G, f7);
                                j3bVar.I = ofFloat2;
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    @Override
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                        byte b2 = r2;
                                        j3b j3bVar2 = j3bVar;
                                        j3bVar2.getClass();
                                        switch (b2) {
                                            case 0:
                                                j3bVar2.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                                j3bVar2.invalidate();
                                                return;
                                            default:
                                                j3bVar2.G = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                                j3bVar2.invalidate();
                                                return;
                                        }
                                    }
                                });
                                j3bVar.I.start();
                            }
                        }
                        anb.X(vkbVar.getTextView(), cmb.F6, null);
                        j3bVar.requestLayout();
                        return;
                    }
                    ((njb) view).setText(gm.S2(u71Var.e));
                    return;
                }
                vkb vkbVar2 = (vkb) view;
                if (i == y71Var.K) {
                    vkbVar2.c(jb6.M0(2131748191, null), null, false, false);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = ((NotificationsCustomSettingsActivity) dVar).J;
                if (i >= 0 && i < arrayList2.size()) {
                    uo7 uo7Var = (uo7) arrayList2.get(i);
                    int i11 = i + 1;
                    if (i11 < arrayList2.size() && ((uo7) arrayList2.get(i11)).a != 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int i12 = u69Var.f;
                    View view3 = u69Var.a;
                    switch (i12) {
                        case 0:
                            ((jf5) view3).setText(uo7Var.e);
                            return;
                        case 1:
                            ((bjb) view3).f(String.valueOf(uo7Var.e), uo7Var.i, z3);
                            return;
                        case 2:
                            ((w8c) view3).f(uo7Var.g, null, z3);
                            return;
                        case 3:
                            ((djb) view3).b(uo7Var.h, String.valueOf(uo7Var.e), z3);
                            return;
                        case 4:
                            njb njbVar = (njb) view3;
                            if (uo7Var.e == null) {
                                njbVar.setFixedSize(12);
                                njbVar.setText(null);
                                return;
                            }
                            njbVar.setFixedSize(0);
                            njbVar.setText(uo7Var.e);
                            return;
                        case 5:
                            ((vkb) view3).c(uo7Var.e, uo7Var.f, false, z3);
                            return;
                        case 6:
                            yn7 yn7Var = (yn7) view3;
                            yn7Var.setDrawLine(true);
                            yn7Var.setChecked(uo7Var.i);
                            yn7Var.b(uo7Var.e, uo7Var.f, uo7Var.d, uo7Var.i, 0, false, z3, true);
                            return;
                        case 7:
                            xib xibVar3 = (xib) view3;
                            if (uo7Var.d == 0) {
                                xibVar3.g(-1, cmb.o7);
                                xibVar3.k(String.valueOf(uo7Var.e), z3);
                                return;
                            }
                            xibVar3.g(cmb.u6, cmb.t6);
                            xibVar3.o(uo7Var.d, String.valueOf(uo7Var.e), z3);
                            return;
                        case 8:
                            to7 to7Var = (to7) view3;
                            to7Var.g(cmb.u6, cmb.t6);
                            String str3 = uo7Var.e;
                            if (uo7Var.d != 1) {
                                z4 = false;
                            }
                            ViewPropertyAnimator animate = to7Var.a0.animate();
                            if (z4) {
                                f3 = 0.0f;
                            } else {
                                f3 = 180.0f;
                            }
                            wi8.t(animate.rotation(f3), d53.h, 340L);
                            to7Var.k(str3, z3);
                            return;
                        default:
                            return;
                    }
                }
                return;
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        tk4 tk4Var;
        int i2;
        v71 v71Var;
        ylb ylbVar;
        FrameLayout yn7Var;
        byte b = this.d;
        int i3 = 5;
        Context context = this.e;
        d dVar = this.f;
        switch (b) {
            case 0:
                y71 y71Var = (y71) dVar;
                if (i != 0) {
                    switch (i) {
                        case 2:
                            ?? frameLayout = new FrameLayout(context);
                            Paint paint = new Paint(1);
                            frameLayout.a = paint;
                            Paint paint2 = new Paint(1);
                            Paint paint3 = new Paint(1);
                            frameLayout.b = paint3;
                            Paint paint4 = new Paint(1);
                            frameLayout.c = paint4;
                            frameLayout.d = new Paint();
                            ef1 ef1Var = new ef1(220, 255);
                            frameLayout.M = ef1Var;
                            frameLayout.setWillNotDraw(false);
                            ef1Var.k = false;
                            paint.setStrokeWidth(gm.L(6.0f));
                            paint2.setStrokeWidth(gm.L(6.0f));
                            paint3.setStrokeWidth(gm.L(6.0f));
                            paint4.setStrokeWidth(gm.L(6.0f));
                            Paint.Cap cap = Paint.Cap.ROUND;
                            paint.setStrokeCap(cap);
                            paint2.setStrokeCap(cap);
                            paint3.setStrokeCap(cap);
                            paint4.setStrokeCap(cap);
                            xd9 xd9Var = new xd9((byte) 11, context, frameLayout);
                            frameLayout.f = xd9Var;
                            frameLayout.addView(xd9Var, qoe.c(-2.0f, -1));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            frameLayout.addView(linearLayout, qoe.c(-2.0f, -1));
                            ct8 ct8Var = new ct8(context, (byte) 13);
                            linearLayout.addView(ct8Var, qoe.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                            TextView textView = new TextView(context);
                            frameLayout.w = textView;
                            int i4 = cmb.x6;
                            anb.X(textView, i4, null);
                            String M0 = jb6.M0(2131752596, "CalculatingSize");
                            int indexOf = M0.indexOf("...");
                            if (indexOf >= 0) {
                                SpannableString spannableString = new SpannableString(M0);
                                yh4 yh4Var = new yh4(textView);
                                frameLayout.J = yh4Var;
                                yh4Var.M(spannableString, indexOf);
                                textView.setText(spannableString);
                            } else {
                                textView.setText(M0);
                            }
                            TextView textView2 = new TextView(context);
                            frameLayout.h = textView2;
                            textView2.setCompoundDrawablePadding(gm.L(6.0f));
                            anb.X(textView2, i4, null);
                            TextView textView3 = new TextView(context);
                            frameLayout.n = textView3;
                            textView3.setCompoundDrawablePadding(gm.L(6.0f));
                            anb.X(textView3, i4, null);
                            TextView textView4 = new TextView(context);
                            frameLayout.r = textView4;
                            textView4.setCompoundDrawablePadding(gm.L(6.0f));
                            anb.X(textView4, i4, null);
                            TextView textView5 = new TextView(context);
                            frameLayout.s = textView5;
                            textView5.setCompoundDrawablePadding(gm.L(6.0f));
                            anb.X(textView5, i4, null);
                            frameLayout.y = cmb.w0(null, cmb.Lj, false);
                            textView2.setCompoundDrawablesWithIntrinsicBounds(cmb.K(gm.L(10.0f), frameLayout.y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView2.setCompoundDrawablePadding(gm.L(6.0f));
                            textView4.setCompoundDrawablesWithIntrinsicBounds(cmb.K(gm.L(10.0f), on2.p(frameLayout.y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView4.setCompoundDrawablePadding(gm.L(6.0f));
                            textView5.setCompoundDrawablesWithIntrinsicBounds(cmb.K(gm.L(10.0f), on2.p(frameLayout.y, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView5.setCompoundDrawablePadding(gm.L(6.0f));
                            textView3.setCompoundDrawablesWithIntrinsicBounds(cmb.K(gm.L(10.0f), frameLayout.y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView3.setCompoundDrawablePadding(gm.L(6.0f));
                            ct8Var.addView(textView, qoe.c(-2.0f, -2));
                            ct8Var.addView(textView3, qoe.c(-2.0f, -2));
                            ct8Var.addView(textView2, qoe.c(-2.0f, -2));
                            ct8Var.addView(textView5, qoe.c(-2.0f, -2));
                            ct8Var.addView(textView4, qoe.c(-2.0f, -2));
                            View view = new View(frameLayout.getContext());
                            frameLayout.x = view;
                            linearLayout.addView(view, qoe.t(-1, -2, 0, 21, 0, 0, 0));
                            view.getLayoutParams().height = 1;
                            anb.h(cmb.c7, null, view);
                            vkb vkbVar = new vkb(frameLayout.getContext());
                            frameLayout.E = vkbVar;
                            linearLayout.addView(vkbVar, qoe.o(-1, -2));
                            tk4Var = frameLayout;
                            break;
                        case 3:
                            tk4Var = new jf5(context);
                            break;
                        case 4:
                            hla hlaVar = new hla(context, null);
                            hlaVar.setCallback(new qn0((byte) 14));
                            int i5 = gda.F;
                            if (i5 == 3) {
                                i2 = 0;
                            } else {
                                i2 = i5 + 1;
                            }
                            hlaVar.b(i2, null, jb6.G(3, "Days", new Object[0]), jb6.G(1, "Weeks", new Object[0]), jb6.G(1, "Months", new Object[0]), jb6.M0(2131748816, null));
                            tk4Var = hlaVar;
                            break;
                        case 5:
                            tk4Var = new x71(y71Var.getParentActivity(), y71Var.getResourceProvider());
                            break;
                        case 6:
                            tk4 tk4Var2 = new tk4(y71Var.getParentActivity(), null);
                            tk4Var2.setIsSingleCell(true);
                            tk4Var2.setItemsCount(3);
                            tk4Var2.setIgnoreHeightCheck(true);
                            tk4Var2.setViewType(25);
                            tk4Var = tk4Var2;
                            break;
                        case 7:
                            tk4Var = new xib(context);
                            break;
                        case 8:
                            fja fjaVar = y71Var.c0;
                            fjaVar.getClass();
                            View xd9Var2 = new xd9((byte) 7, context, fjaVar);
                            xd9Var2.setTag(-33024);
                            xd9Var2.setLayoutParams(new g69(-1, -1));
                            v71Var = xd9Var2;
                            tk4Var = v71Var;
                            break;
                        case 9:
                            v71 v71Var2 = new v71(this, context);
                            y71Var.X = v71Var2;
                            v71Var2.setTag(-33024);
                            v71Var = v71Var2;
                            tk4Var = v71Var;
                            break;
                        case 10:
                            m71 m71Var = new m71(y71Var, context);
                            y71Var.Y = m71Var;
                            m71Var.setTag(-33024);
                            tk4Var = m71Var;
                            break;
                        case 11:
                            v71Var = new oh2(this.e, 4, 21, false, y71Var.getResourceProvider());
                            tk4Var = v71Var;
                            break;
                        case 12:
                            tk4 tk4Var3 = new tk4(y71Var.getParentActivity(), null);
                            tk4Var3.setIsSingleCell(true);
                            tk4Var3.setItemsCount(1);
                            tk4Var3.setIgnoreHeightCheck(true);
                            tk4Var3.setViewType(26);
                            tk4Var = tk4Var3;
                            break;
                        case 13:
                            q71 q71Var = new q71(y71Var, context);
                            y71Var.Z = q71Var;
                            tk4Var = q71Var;
                            break;
                        case 14:
                            hla hlaVar2 = new hla(context, null);
                            float f = ((int) ((y71Var.I / 1024) / 1024)) / 1000.0f;
                            ArrayList arrayList = new ArrayList();
                            if (f <= 17.0f) {
                                arrayList.add(2);
                            }
                            if (f > 5.0f) {
                                arrayList.add(5);
                            }
                            if (f > 16.0f) {
                                arrayList.add(16);
                            }
                            if (f > 32.0f) {
                                arrayList.add(32);
                            }
                            arrayList.add(Integer.MAX_VALUE);
                            String[] strArr = new String[arrayList.size()];
                            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                                if (((Integer) arrayList.get(i6)).intValue() == 1) {
                                    strArr[i6] = "300 MB";
                                } else if (((Integer) arrayList.get(i6)).intValue() == Integer.MAX_VALUE) {
                                    strArr[i6] = jb6.M0(2131747936, null);
                                } else {
                                    strArr[i6] = String.format("%d GB", arrayList.get(i6));
                                }
                            }
                            hlaVar2.setCallback(new xg0(arrayList, (byte) 25));
                            int indexOf2 = arrayList.indexOf(Integer.valueOf(gda.q().getInt("cache_limit", Integer.MAX_VALUE)));
                            if (indexOf2 < 0) {
                                indexOf2 = arrayList.size() - 1;
                            }
                            hlaVar2.b(indexOf2, null, strArr);
                            tk4Var = hlaVar2;
                            break;
                        default:
                            tk4Var = new njb(context);
                            break;
                    }
                } else {
                    tk4Var = new vkb(context);
                }
                return new u69(tk4Var);
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) dVar;
                switch (i) {
                    case 0:
                        yn7Var = new jf5(context);
                        break;
                    case 1:
                        yn7Var = new bjb(context);
                        break;
                    case 2:
                        yn7Var = new w8c(context, 6, 0, false);
                        break;
                    case 3:
                        yn7Var = new djb(context, null);
                        break;
                    case 4:
                        yn7Var = new njb(context);
                        break;
                    case 5:
                        yn7Var = new vkb(context);
                        break;
                    case 6:
                        ylbVar = ((d) notificationsCustomSettingsActivity).resourceProvider;
                        yn7Var = new yn7(this.e, 21, 64, true, ylbVar);
                        break;
                    case 7:
                    default:
                        yn7Var = new xib(context);
                        break;
                    case 8:
                        ?? xibVar = new xib(context);
                        ImageView imageView = new ImageView(context);
                        xibVar.a0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        anb.s(imageView, cmb.u6, notificationsCustomSettingsActivity.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                        imageView.setImageResource(2131232136);
                        if (jb6.a0) {
                            i3 = 3;
                        }
                        xibVar.addView(imageView, qoe.d(24, 24.0f, i3 | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                        yn7Var = xibVar;
                        break;
                }
                return new u69(yn7Var);
        }
    }

    @Override
    public final void y(u69 u69Var) {
        boolean v;
        uo7 uo7Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.d) {
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f;
                ArrayList arrayList3 = notificationsCustomSettingsActivity.J;
                int i = notificationsCustomSettingsActivity.s;
                if (i == 3 || ((arrayList2 = notificationsCustomSettingsActivity.x) != null && arrayList2.isEmpty())) {
                    if (i == 3) {
                        Boolean bool = notificationsCustomSettingsActivity.n;
                        if (bool != null && !bool.booleanValue() && ((arrayList = notificationsCustomSettingsActivity.x) == null || arrayList.isEmpty())) {
                            v = false;
                        } else {
                            v = true;
                        }
                    } else {
                        v = notificationsCustomSettingsActivity.getNotificationsController().v(i);
                    }
                    int b = u69Var.b();
                    View view = u69Var.a;
                    if (b >= 0 && b < arrayList3.size()) {
                        uo7Var = (uo7) arrayList3.get(b);
                    } else {
                        uo7Var = null;
                    }
                    if (uo7Var == null || uo7Var.c != 102) {
                        int i2 = u69Var.f;
                        if (i2 != 0) {
                            if (i2 != 1) {
                                if (i2 != 3) {
                                    if (i2 == 5) {
                                        ((vkb) view).a(null, v);
                                        return;
                                    }
                                    return;
                                }
                                ((djb) view).a(null, v);
                                return;
                            }
                            ((bjb) view).e(null, v);
                            return;
                        }
                        ((jf5) view).a(null, v);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
