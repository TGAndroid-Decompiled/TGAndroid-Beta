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
public final class p61 extends ka {
    public final byte d;
    public final Context e;
    public final d f;

    public p61(d dVar, Context context, byte b) {
        this.d = b;
        this.f = dVar;
        this.e = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
        int i;
        switch (this.d) {
            case 0:
                r61 r61Var = (r61) this.f;
                if (s49Var.b() != r61Var.K && (((i = s49Var.f) != 2 || r61Var.H <= 0 || r61Var.L) && i != 5 && i != 7 && i != 11)) {
                    return false;
                }
                return true;
            default:
                int i2 = s49Var.f;
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
                return ((r61) dVar).g0.size();
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
                return ((n61) ((r61) dVar).g0.get(i)).a;
            default:
                ArrayList arrayList = ((NotificationsCustomSettingsActivity) dVar).J;
                if (i >= 0 && i < arrayList.size()) {
                    return ((qm7) arrayList.get(i)).a;
                }
                return 5;
        }
    }

    @Override
    public final void t(s49 s49Var, int i) {
        int i2;
        String str;
        wgb wgbVar;
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
                r61 r61Var = (r61) dVar;
                ArrayList arrayList = r61Var.g0;
                n61 n61Var = (n61) arrayList.get(i);
                int i3 = s49Var.f;
                View view = s49Var.a;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 7) {
                                    switch (i3) {
                                        case 9:
                                            r61Var.x0();
                                            return;
                                        case 10:
                                            f61 f61Var = r61Var.Y;
                                            if (f61Var != null && !r61Var.L) {
                                                long j = r61Var.H;
                                                if (j <= 0) {
                                                    z4 = false;
                                                }
                                                long j2 = r61Var.I;
                                                int i4 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                                                if (i4 <= 0) {
                                                    f = 0.0f;
                                                } else {
                                                    f = ((float) j) / ((float) j2);
                                                }
                                                long j3 = r61Var.J;
                                                if (j3 > 0 && i4 > 0) {
                                                    f2 = ((float) (j2 - j3)) / ((float) j2);
                                                } else {
                                                    f2 = 0.0f;
                                                }
                                                f61Var.b(f, f2, z4);
                                                return;
                                            }
                                            return;
                                        case 11:
                                            ag2 ag2Var = (ag2) view;
                                            int i5 = n61Var.f;
                                            if (i5 < 0) {
                                                z = r61Var.n0();
                                            } else {
                                                z = r61Var.d[i5];
                                            }
                                            boolean z5 = z;
                                            String str2 = n61Var.d;
                                            int[] iArr = r61Var.V;
                                            int i6 = n61Var.f;
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
                                            spannableString.setSpan(new z3c(gl.o()), 0, spannableString.length(), 33);
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                                            spannableStringBuilder.append((CharSequence) "  ");
                                            spannableStringBuilder.append((CharSequence) spannableString);
                                            String i0 = gl.i0(n61Var.g, false, false);
                                            if (n61Var.f >= 0 ? !n61Var.j : !r61Var.M) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            ag2Var.e(spannableStringBuilder, i0, z5, z2, false);
                                            int i8 = n61Var.h;
                                            int i9 = bkb.j7;
                                            wf2 wf2Var = ag2Var.r;
                                            if (wf2Var != null) {
                                                wf2Var.b(i8, i8, i9);
                                            }
                                            if (n61Var.f < 0) {
                                                bool = Boolean.valueOf(r61Var.M);
                                            } else {
                                                bool = null;
                                            }
                                            ag2Var.setCollapsed(bool);
                                            if (n61Var.f == -1) {
                                                ag2Var.d(new j1(this, (byte) 26), new t(this, ag2Var, (byte) 27));
                                            } else {
                                                ag2Var.d(null, null);
                                            }
                                            ag2Var.setPad(n61Var.i ? 1 : 0);
                                            return;
                                        default:
                                            return;
                                    }
                                }
                                wgb wgbVar2 = (wgb) view;
                                o51 o51Var = r61Var.getMessagesController().h4;
                                int i10 = n61Var.c;
                                int size = o51Var.d(((n61) arrayList.get(i)).c).size();
                                if (size > 0) {
                                    str = k96.G(size, "ExceptionShort", Integer.valueOf(size));
                                } else {
                                    str = null;
                                }
                                String f4 = o51.f(o51Var.c(i10));
                                if (((n61) arrayList.get(i)).c == 0) {
                                    wgbVar = wgbVar2;
                                    wgbVar.r(k96.M0(2131746562, null), f4, true, 2131232154, -11565578, -13276952, true);
                                } else {
                                    wgbVar = wgbVar2;
                                    if (((n61) arrayList.get(i)).c == 1) {
                                        wgbVar.r(k96.M0(2131749265, null), f4, true, 2131232153, -11154873, -14175180, true);
                                    } else if (((n61) arrayList.get(i)).c == 2) {
                                        wgbVar.r(k96.M0(2131752638, null), f4, true, 2131232152, -1007845, -1996271, true);
                                    } else if (((n61) arrayList.get(i)).c == 3) {
                                        wgbVar.r(k96.M0(2131752634, null), f4, false, 2131232159, -765355, -2148011, false);
                                    }
                                }
                                wgbVar.setSubtitle(str);
                                return;
                            }
                            ld5 ld5Var = (ld5) view;
                            ld5Var.setText(((n61) arrayList.get(i)).d);
                            ((n61) arrayList.get(i)).getClass();
                            ld5Var.setTopMargin(15);
                            ((n61) arrayList.get(i)).getClass();
                            ld5Var.setBottomMargin(0);
                            return;
                        }
                        final h1b h1bVar = (h1b) view;
                        boolean z6 = r61Var.L;
                        long j4 = r61Var.e;
                        long j5 = r61Var.H;
                        long j6 = r61Var.J;
                        long j7 = r61Var.I;
                        xf4 xf4Var = h1bVar.J;
                        View view2 = h1bVar.x;
                        TextView textView = h1bVar.n;
                        TextView textView2 = h1bVar.h;
                        TextView textView3 = h1bVar.w;
                        uib uibVar = h1bVar.E;
                        h1bVar.e = z6;
                        TextView textView4 = h1bVar.r;
                        textView4.setText(k96.a0("TotalDeviceFreeSize", null, 2131743734, gl.i0(j6, false, false)));
                        TextView textView5 = h1bVar.s;
                        long j8 = j7 - j6;
                        textView5.setText(k96.a0("TotalDeviceSize", null, 2131743733, gl.i0(j8, false, false)));
                        if (z6) {
                            textView3.setVisibility(0);
                            textView2.setVisibility(8);
                            textView4.setVisibility(8);
                            textView5.setVisibility(8);
                            textView.setVisibility(8);
                            view2.setVisibility(8);
                            uibVar.setVisibility(8);
                            h1bVar.F = 0.0f;
                            h1bVar.G = 0.0f;
                            if (xf4Var != null) {
                                xf4Var.d(textView3);
                            }
                        } else {
                            if (xf4Var != null) {
                                xf4Var.F(textView3);
                            }
                            textView3.setVisibility(8);
                            if (j5 > 0) {
                                i2 = 0;
                                view2.setVisibility(0);
                                uibVar.setVisibility(0);
                                textView2.setVisibility(0);
                                textView.setVisibility(8);
                                uibVar.c(k96.M0(2131752035, null), gl.i0(j5, false, false), false, true);
                                textView2.setText(k96.a0("TelegramCacheSize", null, 2131744005, gl.i0(j5 + j4, false, false)));
                            } else {
                                i2 = 0;
                                textView2.setVisibility(8);
                                textView.setVisibility(0);
                                textView.setText(k96.a0("LocalDatabaseSize", null, 2131748577, gl.i0(j4, false, false)));
                                view2.setVisibility(8);
                                uibVar.setVisibility(8);
                            }
                            textView4.setVisibility(i2);
                            textView5.setVisibility(i2);
                            float f5 = (float) j7;
                            float f6 = ((float) (j5 + j4)) / f5;
                            float f7 = ((float) j8) / f5;
                            if (h1bVar.F != f6) {
                                ValueAnimator valueAnimator = h1bVar.H;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                }
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(h1bVar.F, f6);
                                h1bVar.H = ofFloat;
                                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    @Override
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                        byte b2 = r2;
                                        h1b h1bVar2 = h1bVar;
                                        h1bVar2.getClass();
                                        switch (b2) {
                                            case 0:
                                                h1bVar2.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                                h1bVar2.invalidate();
                                                return;
                                            default:
                                                h1bVar2.G = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                                h1bVar2.invalidate();
                                                return;
                                        }
                                    }
                                });
                                h1bVar.H.start();
                            }
                            if (h1bVar.G != f7) {
                                ValueAnimator valueAnimator2 = h1bVar.I;
                                if (valueAnimator2 != null) {
                                    valueAnimator2.cancel();
                                }
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(h1bVar.G, f7);
                                h1bVar.I = ofFloat2;
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    @Override
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                        byte b2 = r2;
                                        h1b h1bVar2 = h1bVar;
                                        h1bVar2.getClass();
                                        switch (b2) {
                                            case 0:
                                                h1bVar2.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                                h1bVar2.invalidate();
                                                return;
                                            default:
                                                h1bVar2.G = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                                h1bVar2.invalidate();
                                                return;
                                        }
                                    }
                                });
                                h1bVar.I.start();
                            }
                        }
                        zkb.X(uibVar.getTextView(), bkb.F6, null);
                        h1bVar.requestLayout();
                        return;
                    }
                    ((mhb) view).setText(gl.S2(n61Var.e));
                    return;
                }
                uib uibVar2 = (uib) view;
                if (i == r61Var.K) {
                    uibVar2.c(k96.M0(2131748242, null), null, false, false);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = ((NotificationsCustomSettingsActivity) dVar).J;
                if (i >= 0 && i < arrayList2.size()) {
                    qm7 qm7Var = (qm7) arrayList2.get(i);
                    int i11 = i + 1;
                    if (i11 < arrayList2.size() && ((qm7) arrayList2.get(i11)).a != 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int i12 = s49Var.f;
                    View view3 = s49Var.a;
                    switch (i12) {
                        case 0:
                            ((ld5) view3).setText(qm7Var.e);
                            return;
                        case 1:
                            ((ahb) view3).f(String.valueOf(qm7Var.e), qm7Var.i, z3);
                            return;
                        case 2:
                            ((v6c) view3).f(qm7Var.g, null, z3);
                            return;
                        case 3:
                            ((chb) view3).b(qm7Var.h, String.valueOf(qm7Var.e), z3);
                            return;
                        case 4:
                            mhb mhbVar = (mhb) view3;
                            if (qm7Var.e == null) {
                                mhbVar.setFixedSize(12);
                                mhbVar.setText(null);
                                return;
                            }
                            mhbVar.setFixedSize(0);
                            mhbVar.setText(qm7Var.e);
                            return;
                        case 5:
                            ((uib) view3).c(qm7Var.e, qm7Var.f, false, z3);
                            return;
                        case 6:
                            vl7 vl7Var = (vl7) view3;
                            vl7Var.setDrawLine(true);
                            vl7Var.setChecked(qm7Var.i);
                            vl7Var.b(qm7Var.e, qm7Var.f, qm7Var.d, qm7Var.i, 0, false, z3, true);
                            return;
                        case 7:
                            wgb wgbVar3 = (wgb) view3;
                            if (qm7Var.d == 0) {
                                wgbVar3.g(-1, bkb.o7);
                                wgbVar3.k(String.valueOf(qm7Var.e), z3);
                                return;
                            }
                            wgbVar3.g(bkb.u6, bkb.t6);
                            wgbVar3.o(qm7Var.d, String.valueOf(qm7Var.e), z3);
                            return;
                        case 8:
                            pm7 pm7Var = (pm7) view3;
                            pm7Var.g(bkb.u6, bkb.t6);
                            String str3 = qm7Var.e;
                            if (qm7Var.d != 1) {
                                z4 = false;
                            }
                            ViewPropertyAnimator animate = pm7Var.a0.animate();
                            if (z4) {
                                f3 = 0.0f;
                            } else {
                                f3 = 180.0f;
                            }
                            ug8.t(animate.rotation(f3), s33.h, 340L);
                            pm7Var.k(str3, z3);
                            return;
                        default:
                            return;
                    }
                }
                return;
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        pi4 pi4Var;
        int i2;
        o61 o61Var;
        wjb wjbVar;
        FrameLayout vl7Var;
        byte b = this.d;
        int i3 = 5;
        Context context = this.e;
        d dVar = this.f;
        switch (b) {
            case 0:
                r61 r61Var = (r61) dVar;
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
                            wd1 wd1Var = new wd1(220, 255);
                            frameLayout.M = wd1Var;
                            frameLayout.setWillNotDraw(false);
                            wd1Var.k = false;
                            paint.setStrokeWidth(gl.L(6.0f));
                            paint2.setStrokeWidth(gl.L(6.0f));
                            paint3.setStrokeWidth(gl.L(6.0f));
                            paint4.setStrokeWidth(gl.L(6.0f));
                            Paint.Cap cap = Paint.Cap.ROUND;
                            paint.setStrokeCap(cap);
                            paint2.setStrokeCap(cap);
                            paint3.setStrokeCap(cap);
                            paint4.setStrokeCap(cap);
                            si9 si9Var = new si9((byte) 10, context, frameLayout);
                            frameLayout.f = si9Var;
                            frameLayout.addView(si9Var, nme.c(-2.0f, -1));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            frameLayout.addView(linearLayout, nme.c(-2.0f, -1));
                            ar8 ar8Var = new ar8(context, (byte) 13);
                            linearLayout.addView(ar8Var, nme.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                            TextView textView = new TextView(context);
                            frameLayout.w = textView;
                            int i4 = bkb.x6;
                            zkb.X(textView, i4, null);
                            String M0 = k96.M0(2131752631, "CalculatingSize");
                            int indexOf = M0.indexOf("...");
                            if (indexOf >= 0) {
                                SpannableString spannableString = new SpannableString(M0);
                                xf4 xf4Var = new xf4(textView);
                                frameLayout.J = xf4Var;
                                xf4Var.M(spannableString, indexOf);
                                textView.setText(spannableString);
                            } else {
                                textView.setText(M0);
                            }
                            TextView textView2 = new TextView(context);
                            frameLayout.h = textView2;
                            textView2.setCompoundDrawablePadding(gl.L(6.0f));
                            zkb.X(textView2, i4, null);
                            TextView textView3 = new TextView(context);
                            frameLayout.n = textView3;
                            textView3.setCompoundDrawablePadding(gl.L(6.0f));
                            zkb.X(textView3, i4, null);
                            TextView textView4 = new TextView(context);
                            frameLayout.r = textView4;
                            textView4.setCompoundDrawablePadding(gl.L(6.0f));
                            zkb.X(textView4, i4, null);
                            TextView textView5 = new TextView(context);
                            frameLayout.s = textView5;
                            textView5.setCompoundDrawablePadding(gl.L(6.0f));
                            zkb.X(textView5, i4, null);
                            frameLayout.y = bkb.w0(null, bkb.Lj, false);
                            textView2.setCompoundDrawablesWithIntrinsicBounds(bkb.K(gl.L(10.0f), frameLayout.y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView2.setCompoundDrawablePadding(gl.L(6.0f));
                            textView4.setCompoundDrawablesWithIntrinsicBounds(bkb.K(gl.L(10.0f), bm2.o(frameLayout.y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView4.setCompoundDrawablePadding(gl.L(6.0f));
                            textView5.setCompoundDrawablesWithIntrinsicBounds(bkb.K(gl.L(10.0f), bm2.o(frameLayout.y, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView5.setCompoundDrawablePadding(gl.L(6.0f));
                            textView3.setCompoundDrawablesWithIntrinsicBounds(bkb.K(gl.L(10.0f), frameLayout.y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView3.setCompoundDrawablePadding(gl.L(6.0f));
                            ar8Var.addView(textView, nme.c(-2.0f, -2));
                            ar8Var.addView(textView3, nme.c(-2.0f, -2));
                            ar8Var.addView(textView2, nme.c(-2.0f, -2));
                            ar8Var.addView(textView5, nme.c(-2.0f, -2));
                            ar8Var.addView(textView4, nme.c(-2.0f, -2));
                            View view = new View(frameLayout.getContext());
                            frameLayout.x = view;
                            linearLayout.addView(view, nme.t(-1, -2, 0, 21, 0, 0, 0));
                            view.getLayoutParams().height = 1;
                            zkb.h(bkb.c7, null, view);
                            uib uibVar = new uib(frameLayout.getContext());
                            frameLayout.E = uibVar;
                            linearLayout.addView(uibVar, nme.o(-1, -2));
                            pi4Var = frameLayout;
                            break;
                        case 3:
                            pi4Var = new ld5(context);
                            break;
                        case 4:
                            fja fjaVar = new fja(context, null);
                            fjaVar.setCallback(new qm0((byte) 14));
                            int i5 = gba.F;
                            if (i5 == 3) {
                                i2 = 0;
                            } else {
                                i2 = i5 + 1;
                            }
                            fjaVar.b(i2, null, k96.G(3, "Days", new Object[0]), k96.G(1, "Weeks", new Object[0]), k96.G(1, "Months", new Object[0]), k96.M0(2131748867, null));
                            pi4Var = fjaVar;
                            break;
                        case 5:
                            pi4Var = new q61(r61Var.getParentActivity(), r61Var.getResourceProvider());
                            break;
                        case 6:
                            pi4 pi4Var2 = new pi4(r61Var.getParentActivity(), null);
                            pi4Var2.setIsSingleCell(true);
                            pi4Var2.setItemsCount(3);
                            pi4Var2.setIgnoreHeightCheck(true);
                            pi4Var2.setViewType(25);
                            pi4Var = pi4Var2;
                            break;
                        case 7:
                            pi4Var = new wgb(context);
                            break;
                        case 8:
                            dha dhaVar = r61Var.c0;
                            dhaVar.getClass();
                            View si9Var2 = new si9((byte) 6, context, dhaVar);
                            si9Var2.setTag(-33024);
                            si9Var2.setLayoutParams(new e49(-1, -1));
                            pi4Var = si9Var2;
                            break;
                        case 9:
                            o61 o61Var2 = new o61(this, context);
                            r61Var.X = o61Var2;
                            o61Var2.setTag(-33024);
                            o61Var = o61Var2;
                            pi4Var = o61Var;
                            break;
                        case 10:
                            f61 f61Var = new f61(r61Var, context);
                            r61Var.Y = f61Var;
                            f61Var.setTag(-33024);
                            pi4Var = f61Var;
                            break;
                        case 11:
                            o61Var = new ag2(this.e, 4, 21, false, r61Var.getResourceProvider());
                            pi4Var = o61Var;
                            break;
                        case 12:
                            pi4 pi4Var3 = new pi4(r61Var.getParentActivity(), null);
                            pi4Var3.setIsSingleCell(true);
                            pi4Var3.setItemsCount(1);
                            pi4Var3.setIgnoreHeightCheck(true);
                            pi4Var3.setViewType(26);
                            pi4Var = pi4Var3;
                            break;
                        case 13:
                            j61 j61Var = new j61(r61Var, context);
                            r61Var.Z = j61Var;
                            pi4Var = j61Var;
                            break;
                        case 14:
                            fja fjaVar2 = new fja(context, null);
                            float f = ((int) ((r61Var.I / 1024) / 1024)) / 1000.0f;
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
                                    strArr[i6] = k96.M0(2131748010, null);
                                } else {
                                    strArr[i6] = String.format("%d GB", arrayList.get(i6));
                                }
                            }
                            fjaVar2.setCallback(new sg0(arrayList, (byte) 22));
                            int indexOf2 = arrayList.indexOf(Integer.valueOf(gba.q().getInt("cache_limit", Integer.MAX_VALUE)));
                            if (indexOf2 < 0) {
                                indexOf2 = arrayList.size() - 1;
                            }
                            fjaVar2.b(indexOf2, null, strArr);
                            pi4Var = fjaVar2;
                            break;
                        default:
                            pi4Var = new mhb(context);
                            break;
                    }
                } else {
                    pi4Var = new uib(context);
                }
                return new s49(pi4Var);
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) dVar;
                switch (i) {
                    case 0:
                        vl7Var = new ld5(context);
                        break;
                    case 1:
                        vl7Var = new ahb(context);
                        break;
                    case 2:
                        vl7Var = new v6c(context, 6, 0, false);
                        break;
                    case 3:
                        vl7Var = new chb(context, null);
                        break;
                    case 4:
                        vl7Var = new mhb(context);
                        break;
                    case 5:
                        vl7Var = new uib(context);
                        break;
                    case 6:
                        wjbVar = ((d) notificationsCustomSettingsActivity).resourceProvider;
                        vl7Var = new vl7(this.e, 21, 64, true, wjbVar);
                        break;
                    case 7:
                    default:
                        vl7Var = new wgb(context);
                        break;
                    case 8:
                        ?? wgbVar = new wgb(context);
                        ImageView imageView = new ImageView(context);
                        wgbVar.a0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        zkb.s(imageView, bkb.u6, notificationsCustomSettingsActivity.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                        imageView.setImageResource(2131232135);
                        if (k96.a0) {
                            i3 = 3;
                        }
                        wgbVar.addView(imageView, nme.d(24, 24.0f, i3 | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                        vl7Var = wgbVar;
                        break;
                }
                return new s49(vl7Var);
        }
    }

    @Override
    public final void y(s49 s49Var) {
        boolean v;
        qm7 qm7Var;
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
                    int b = s49Var.b();
                    View view = s49Var.a;
                    if (b >= 0 && b < arrayList3.size()) {
                        qm7Var = (qm7) arrayList3.get(b);
                    } else {
                        qm7Var = null;
                    }
                    if (qm7Var == null || qm7Var.c != 102) {
                        int i2 = s49Var.f;
                        if (i2 != 0) {
                            if (i2 != 1) {
                                if (i2 != 3) {
                                    if (i2 == 5) {
                                        ((uib) view).a(null, v);
                                        return;
                                    }
                                    return;
                                }
                                ((chb) view).a(null, v);
                                return;
                            }
                            ((ahb) view).e(null, v);
                            return;
                        }
                        ((ld5) view).a(null, v);
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
