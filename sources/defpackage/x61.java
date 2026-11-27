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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class x61 extends la {
    public final byte d;
    public final Context e;
    public final e f;

    public x61(e eVar, Context context, byte b) {
        this.d = b;
        this.f = eVar;
        this.e = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i;
        switch (this.d) {
            case 0:
                z61 z61Var = (z61) this.f;
                if (f89Var.b() != z61Var.K && (((i = f89Var.f) != 2 || z61Var.H <= 0 || z61Var.L) && i != 5 && i != 7 && i != 11)) {
                    return false;
                }
                return true;
            default:
                int i2 = f89Var.f;
                if (i2 == 0 || i2 == 4) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int b() {
        byte b = this.d;
        e eVar = this.f;
        switch (b) {
            case 0:
                return ((z61) eVar).g0.size();
            default:
                return ((NotificationsCustomSettingsActivity) eVar).J.size();
        }
    }

    @Override
    public final int d(int i) {
        byte b = this.d;
        e eVar = this.f;
        switch (b) {
            case 0:
                return ((v61) ((z61) eVar).g0.get(i)).a;
            default:
                ArrayList arrayList = ((NotificationsCustomSettingsActivity) eVar).J;
                if (i >= 0 && i < arrayList.size()) {
                    return ((qp7) arrayList.get(i)).a;
                }
                return 5;
        }
    }

    @Override
    public final void t(f89 f89Var, int i) {
        int i2;
        String str;
        skb skbVar;
        float f;
        float f2;
        boolean z;
        String format;
        boolean z2;
        Boolean bool;
        boolean z3;
        float f3;
        byte b = this.d;
        e eVar = this.f;
        boolean z4 = true;
        switch (b) {
            case 0:
                z61 z61Var = (z61) eVar;
                ArrayList arrayList = z61Var.g0;
                v61 v61Var = (v61) arrayList.get(i);
                int i3 = f89Var.f;
                View view = f89Var.a;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 7) {
                                    switch (i3) {
                                        case 9:
                                            z61Var.y0();
                                            return;
                                        case 10:
                                            n61 n61Var = z61Var.Y;
                                            if (n61Var != null && !z61Var.L) {
                                                long j = z61Var.H;
                                                if (j <= 0) {
                                                    z4 = false;
                                                }
                                                long j2 = z61Var.I;
                                                int i4 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                                                if (i4 <= 0) {
                                                    f = 0.0f;
                                                } else {
                                                    f = ((float) j) / ((float) j2);
                                                }
                                                long j3 = z61Var.J;
                                                if (j3 > 0 && i4 > 0) {
                                                    f2 = ((float) (j2 - j3)) / ((float) j2);
                                                } else {
                                                    f2 = 0.0f;
                                                }
                                                n61Var.b(f, f2, z4);
                                                return;
                                            }
                                            return;
                                        case 11:
                                            sg2 sg2Var = (sg2) view;
                                            int i5 = v61Var.f;
                                            if (i5 < 0) {
                                                z = z61Var.n0();
                                            } else {
                                                z = z61Var.d[i5];
                                            }
                                            boolean z5 = z;
                                            String str2 = v61Var.d;
                                            int[] iArr = z61Var.V;
                                            int i6 = v61Var.f;
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
                                            spannableString.setSpan(new y7c(hl.o()), 0, spannableString.length(), 33);
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                                            spannableStringBuilder.append((CharSequence) "  ");
                                            spannableStringBuilder.append((CharSequence) spannableString);
                                            String i0 = hl.i0(v61Var.g, false, false);
                                            if (v61Var.f >= 0 ? !v61Var.j : !z61Var.M) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            sg2Var.e(spannableStringBuilder, i0, z5, z2, false);
                                            int i8 = v61Var.h;
                                            int i9 = aob.k7;
                                            og2 og2Var = sg2Var.r;
                                            if (og2Var != null) {
                                                og2Var.b(i8, i8, i9);
                                            }
                                            if (v61Var.f < 0) {
                                                bool = Boolean.valueOf(z61Var.M);
                                            } else {
                                                bool = null;
                                            }
                                            sg2Var.setCollapsed(bool);
                                            if (v61Var.f == -1) {
                                                sg2Var.d(new k1(this, (byte) 28), new t(this, sg2Var, (byte) 27));
                                            } else {
                                                sg2Var.d(null, null);
                                            }
                                            sg2Var.setPad(v61Var.i ? 1 : 0);
                                            return;
                                        default:
                                            return;
                                    }
                                }
                                skb skbVar2 = (skb) view;
                                w51 w51Var = z61Var.getMessagesController().i4;
                                int i10 = v61Var.c;
                                int size = w51Var.d(((v61) arrayList.get(i)).c).size();
                                if (size > 0) {
                                    str = ob6.G(size, "ExceptionShort", Integer.valueOf(size));
                                } else {
                                    str = null;
                                }
                                String f4 = w51.f(w51Var.c(i10));
                                if (((v61) arrayList.get(i)).c == 0) {
                                    skbVar = skbVar2;
                                    skbVar.r(ob6.M0(2131746482, null), f4, true, 2131232154, -11565578, -13276952, true);
                                } else {
                                    skbVar = skbVar2;
                                    if (((v61) arrayList.get(i)).c == 1) {
                                        skbVar.r(ob6.M0(2131749211, null), f4, true, 2131232153, -11154873, -14175180, true);
                                    } else if (((v61) arrayList.get(i)).c == 2) {
                                        skbVar.r(ob6.M0(2131752631, null), f4, true, 2131232152, -1007845, -1996271, true);
                                    } else if (((v61) arrayList.get(i)).c == 3) {
                                        skbVar.r(ob6.M0(2131752627, null), f4, false, 2131232159, -765355, -2148011, false);
                                    }
                                }
                                skbVar.setSubtitle(str);
                                return;
                            }
                            mf5 mf5Var = (mf5) view;
                            mf5Var.setText(((v61) arrayList.get(i)).d);
                            ((v61) arrayList.get(i)).getClass();
                            mf5Var.setTopMargin(15);
                            ((v61) arrayList.get(i)).getClass();
                            mf5Var.setBottomMargin(0);
                            return;
                        }
                        final e5b e5bVar = (e5b) view;
                        boolean z6 = z61Var.L;
                        long j4 = z61Var.e;
                        long j5 = z61Var.H;
                        long j6 = z61Var.J;
                        long j7 = z61Var.I;
                        vh4 vh4Var = e5bVar.J;
                        View view2 = e5bVar.x;
                        TextView textView = e5bVar.n;
                        TextView textView2 = e5bVar.h;
                        TextView textView3 = e5bVar.w;
                        qmb qmbVar = e5bVar.E;
                        e5bVar.e = z6;
                        TextView textView4 = e5bVar.r;
                        textView4.setText(ob6.a0("TotalDeviceFreeSize", null, 2131743628, hl.i0(j6, false, false)));
                        TextView textView5 = e5bVar.s;
                        long j8 = j7 - j6;
                        textView5.setText(ob6.a0("TotalDeviceSize", null, 2131743627, hl.i0(j8, false, false)));
                        if (z6) {
                            textView3.setVisibility(0);
                            textView2.setVisibility(8);
                            textView4.setVisibility(8);
                            textView5.setVisibility(8);
                            textView.setVisibility(8);
                            view2.setVisibility(8);
                            qmbVar.setVisibility(8);
                            e5bVar.F = 0.0f;
                            e5bVar.G = 0.0f;
                            if (vh4Var != null) {
                                vh4Var.c(textView3);
                            }
                        } else {
                            if (vh4Var != null) {
                                vh4Var.F(textView3);
                            }
                            textView3.setVisibility(8);
                            if (j5 > 0) {
                                i2 = 0;
                                view2.setVisibility(0);
                                qmbVar.setVisibility(0);
                                textView2.setVisibility(0);
                                textView.setVisibility(8);
                                qmbVar.c(ob6.M0(2131752012, null), hl.i0(j5, false, false), false, true);
                                textView2.setText(ob6.a0("TelegramCacheSize", null, 2131743899, hl.i0(j5 + j4, false, false)));
                            } else {
                                i2 = 0;
                                textView2.setVisibility(8);
                                textView.setVisibility(0);
                                textView.setText(ob6.a0("LocalDatabaseSize", null, 2131748523, hl.i0(j4, false, false)));
                                view2.setVisibility(8);
                                qmbVar.setVisibility(8);
                            }
                            textView4.setVisibility(i2);
                            textView5.setVisibility(i2);
                            float f5 = (float) j7;
                            float f6 = ((float) (j5 + j4)) / f5;
                            float f7 = ((float) j8) / f5;
                            if (e5bVar.F != f6) {
                                ValueAnimator valueAnimator = e5bVar.H;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                }
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(e5bVar.F, f6);
                                e5bVar.H = ofFloat;
                                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    @Override
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                        byte b2 = r2;
                                        e5b e5bVar2 = e5bVar;
                                        e5bVar2.getClass();
                                        switch (b2) {
                                            case 0:
                                                e5bVar2.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                                e5bVar2.invalidate();
                                                return;
                                            default:
                                                e5bVar2.G = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                                e5bVar2.invalidate();
                                                return;
                                        }
                                    }
                                });
                                e5bVar.H.start();
                            }
                            if (e5bVar.G != f7) {
                                ValueAnimator valueAnimator2 = e5bVar.I;
                                if (valueAnimator2 != null) {
                                    valueAnimator2.cancel();
                                }
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(e5bVar.G, f7);
                                e5bVar.I = ofFloat2;
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    @Override
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                        byte b2 = r2;
                                        e5b e5bVar2 = e5bVar;
                                        e5bVar2.getClass();
                                        switch (b2) {
                                            case 0:
                                                e5bVar2.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                                e5bVar2.invalidate();
                                                return;
                                            default:
                                                e5bVar2.G = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                                e5bVar2.invalidate();
                                                return;
                                        }
                                    }
                                });
                                e5bVar.I.start();
                            }
                        }
                        yob.X(qmbVar.getTextView(), aob.G6, null);
                        e5bVar.requestLayout();
                        return;
                    }
                    ((ilb) view).setText(hl.S2(v61Var.e));
                    return;
                }
                qmb qmbVar2 = (qmb) view;
                if (i == z61Var.K) {
                    qmbVar2.c(ob6.M0(2131748188, null), null, false, false);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = ((NotificationsCustomSettingsActivity) eVar).J;
                if (i >= 0 && i < arrayList2.size()) {
                    qp7 qp7Var = (qp7) arrayList2.get(i);
                    int i11 = i + 1;
                    if (i11 < arrayList2.size() && ((qp7) arrayList2.get(i11)).a != 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int i12 = f89Var.f;
                    View view3 = f89Var.a;
                    switch (i12) {
                        case 0:
                            ((mf5) view3).setText(qp7Var.e);
                            return;
                        case 1:
                            ((wkb) view3).f(String.valueOf(qp7Var.e), qp7Var.i, z3);
                            return;
                        case 2:
                            ((vac) view3).f(qp7Var.g, null, z3);
                            return;
                        case 3:
                            ((ykb) view3).b(qp7Var.h, String.valueOf(qp7Var.e), z3);
                            return;
                        case 4:
                            ilb ilbVar = (ilb) view3;
                            if (qp7Var.e == null) {
                                ilbVar.setFixedSize(12);
                                ilbVar.setText(null);
                                return;
                            }
                            ilbVar.setFixedSize(0);
                            ilbVar.setText(qp7Var.e);
                            return;
                        case 5:
                            ((qmb) view3).c(qp7Var.e, qp7Var.f, false, z3);
                            return;
                        case 6:
                            uo7 uo7Var = (uo7) view3;
                            uo7Var.setDrawLine(true);
                            uo7Var.setChecked(qp7Var.i);
                            uo7Var.b(qp7Var.e, qp7Var.f, qp7Var.d, qp7Var.i, 0, false, z3, true);
                            return;
                        case 7:
                            skb skbVar3 = (skb) view3;
                            if (qp7Var.d == 0) {
                                skbVar3.g(-1, aob.p7);
                                skbVar3.k(String.valueOf(qp7Var.e), z3);
                                return;
                            }
                            skbVar3.g(aob.v6, aob.u6);
                            skbVar3.o(qp7Var.d, String.valueOf(qp7Var.e), z3);
                            return;
                        case 8:
                            pp7 pp7Var = (pp7) view3;
                            pp7Var.g(aob.v6, aob.u6);
                            String str3 = qp7Var.e;
                            if (qp7Var.d != 1) {
                                z4 = false;
                            }
                            ViewPropertyAnimator animate = pp7Var.a0.animate();
                            if (z4) {
                                f3 = 0.0f;
                            } else {
                                f3 = 180.0f;
                            }
                            ik8.t(animate.rotation(f3), k43.h, 340L);
                            pp7Var.k(str3, z3);
                            return;
                        default:
                            return;
                    }
                }
                return;
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        tk4 tk4Var;
        int i2;
        w61 w61Var;
        vnb vnbVar;
        FrameLayout uo7Var;
        byte b = this.d;
        int i3 = 5;
        Context context = this.e;
        e eVar = this.f;
        switch (b) {
            case 0:
                z61 z61Var = (z61) eVar;
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
                            fe1 fe1Var = new fe1(220, 255);
                            frameLayout.M = fe1Var;
                            frameLayout.setWillNotDraw(false);
                            fe1Var.k = false;
                            paint.setStrokeWidth(hl.L(6.0f));
                            paint2.setStrokeWidth(hl.L(6.0f));
                            paint3.setStrokeWidth(hl.L(6.0f));
                            paint4.setStrokeWidth(hl.L(6.0f));
                            Paint.Cap cap = Paint.Cap.ROUND;
                            paint.setStrokeCap(cap);
                            paint2.setStrokeCap(cap);
                            paint3.setStrokeCap(cap);
                            paint4.setStrokeCap(cap);
                            nf9 nf9Var = new nf9((byte) 11, context, frameLayout);
                            frameLayout.f = nf9Var;
                            frameLayout.addView(nf9Var, tre.c(-2.0f, -1));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            frameLayout.addView(linearLayout, tre.c(-2.0f, -1));
                            ir8 ir8Var = new ir8(context, (byte) 14);
                            linearLayout.addView(ir8Var, tre.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                            TextView textView = new TextView(context);
                            frameLayout.w = textView;
                            int i4 = aob.y6;
                            yob.X(textView, i4, null);
                            String M0 = ob6.M0(2131752624, "CalculatingSize");
                            int indexOf = M0.indexOf("...");
                            if (indexOf >= 0) {
                                SpannableString spannableString = new SpannableString(M0);
                                vh4 vh4Var = new vh4(textView);
                                frameLayout.J = vh4Var;
                                vh4Var.M(spannableString, indexOf);
                                textView.setText(spannableString);
                            } else {
                                textView.setText(M0);
                            }
                            TextView textView2 = new TextView(context);
                            frameLayout.h = textView2;
                            textView2.setCompoundDrawablePadding(hl.L(6.0f));
                            yob.X(textView2, i4, null);
                            TextView textView3 = new TextView(context);
                            frameLayout.n = textView3;
                            textView3.setCompoundDrawablePadding(hl.L(6.0f));
                            yob.X(textView3, i4, null);
                            TextView textView4 = new TextView(context);
                            frameLayout.r = textView4;
                            textView4.setCompoundDrawablePadding(hl.L(6.0f));
                            yob.X(textView4, i4, null);
                            TextView textView5 = new TextView(context);
                            frameLayout.s = textView5;
                            textView5.setCompoundDrawablePadding(hl.L(6.0f));
                            yob.X(textView5, i4, null);
                            frameLayout.y = aob.w0(null, aob.Mj, false);
                            textView2.setCompoundDrawablesWithIntrinsicBounds(aob.K(hl.L(10.0f), frameLayout.y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView2.setCompoundDrawablePadding(hl.L(6.0f));
                            textView4.setCompoundDrawablesWithIntrinsicBounds(aob.K(hl.L(10.0f), vm2.o(frameLayout.y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView4.setCompoundDrawablePadding(hl.L(6.0f));
                            textView5.setCompoundDrawablesWithIntrinsicBounds(aob.K(hl.L(10.0f), vm2.o(frameLayout.y, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView5.setCompoundDrawablePadding(hl.L(6.0f));
                            textView3.setCompoundDrawablesWithIntrinsicBounds(aob.K(hl.L(10.0f), frameLayout.y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView3.setCompoundDrawablePadding(hl.L(6.0f));
                            ir8Var.addView(textView, tre.c(-2.0f, -2));
                            ir8Var.addView(textView3, tre.c(-2.0f, -2));
                            ir8Var.addView(textView2, tre.c(-2.0f, -2));
                            ir8Var.addView(textView5, tre.c(-2.0f, -2));
                            ir8Var.addView(textView4, tre.c(-2.0f, -2));
                            View view = new View(frameLayout.getContext());
                            frameLayout.x = view;
                            linearLayout.addView(view, tre.t(-1, -2, 0, 21, 0, 0, 0));
                            view.getLayoutParams().height = 1;
                            yob.h(aob.d7, null, view);
                            qmb qmbVar = new qmb(frameLayout.getContext());
                            frameLayout.E = qmbVar;
                            linearLayout.addView(qmbVar, tre.o(-1, -2));
                            tk4Var = frameLayout;
                            break;
                        case 3:
                            tk4Var = new mf5(context);
                            break;
                        case 4:
                            zma zmaVar = new zma(context, null);
                            zmaVar.setCallback(new rm0((byte) 15));
                            int i5 = xea.F;
                            if (i5 == 3) {
                                i2 = 0;
                            } else {
                                i2 = i5 + 1;
                            }
                            zmaVar.b(i2, null, ob6.G(3, "Days", new Object[0]), ob6.G(1, "Weeks", new Object[0]), ob6.G(1, "Months", new Object[0]), ob6.M0(2131748813, null));
                            tk4Var = zmaVar;
                            break;
                        case 5:
                            tk4Var = new y61(z61Var.getParentActivity(), z61Var.getResourceProvider());
                            break;
                        case 6:
                            tk4 tk4Var2 = new tk4(z61Var.getParentActivity(), null);
                            tk4Var2.setIsSingleCell(true);
                            tk4Var2.setItemsCount(3);
                            tk4Var2.setIgnoreHeightCheck(true);
                            tk4Var2.setViewType(25);
                            tk4Var = tk4Var2;
                            break;
                        case 7:
                            tk4Var = new skb(context);
                            break;
                        case 8:
                            wka wkaVar = z61Var.c0;
                            wkaVar.getClass();
                            View nf9Var2 = new nf9((byte) 7, context, wkaVar);
                            nf9Var2.setTag(-33024);
                            nf9Var2.setLayoutParams(new r79(-1, -1));
                            w61Var = nf9Var2;
                            tk4Var = w61Var;
                            break;
                        case 9:
                            w61 w61Var2 = new w61(this, context);
                            z61Var.X = w61Var2;
                            w61Var2.setTag(-33024);
                            w61Var = w61Var2;
                            tk4Var = w61Var;
                            break;
                        case 10:
                            n61 n61Var = new n61(z61Var, context);
                            z61Var.Y = n61Var;
                            n61Var.setTag(-33024);
                            tk4Var = n61Var;
                            break;
                        case 11:
                            w61Var = new sg2(this.e, 4, 21, false, z61Var.getResourceProvider());
                            tk4Var = w61Var;
                            break;
                        case 12:
                            tk4 tk4Var3 = new tk4(z61Var.getParentActivity(), null);
                            tk4Var3.setIsSingleCell(true);
                            tk4Var3.setItemsCount(1);
                            tk4Var3.setIgnoreHeightCheck(true);
                            tk4Var3.setViewType(26);
                            tk4Var = tk4Var3;
                            break;
                        case 13:
                            r61 r61Var = new r61(z61Var, context);
                            z61Var.Z = r61Var;
                            tk4Var = r61Var;
                            break;
                        case 14:
                            zma zmaVar2 = new zma(context, null);
                            float f = ((int) ((z61Var.I / 1024) / 1024)) / 1000.0f;
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
                                    strArr[i6] = ob6.M0(2131747933, null);
                                } else {
                                    strArr[i6] = String.format("%d GB", arrayList.get(i6));
                                }
                            }
                            zmaVar2.setCallback(new tg0(arrayList, (byte) 23));
                            int indexOf2 = arrayList.indexOf(Integer.valueOf(xea.q().getInt("cache_limit", Integer.MAX_VALUE)));
                            if (indexOf2 < 0) {
                                indexOf2 = arrayList.size() - 1;
                            }
                            zmaVar2.b(indexOf2, null, strArr);
                            tk4Var = zmaVar2;
                            break;
                        default:
                            tk4Var = new ilb(context);
                            break;
                    }
                } else {
                    tk4Var = new qmb(context);
                }
                return new f89(tk4Var);
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) eVar;
                switch (i) {
                    case 0:
                        uo7Var = new mf5(context);
                        break;
                    case 1:
                        uo7Var = new wkb(context);
                        break;
                    case 2:
                        uo7Var = new vac(context, 6, 0, false);
                        break;
                    case 3:
                        uo7Var = new ykb(context, null);
                        break;
                    case 4:
                        uo7Var = new ilb(context);
                        break;
                    case 5:
                        uo7Var = new qmb(context);
                        break;
                    case 6:
                        vnbVar = ((e) notificationsCustomSettingsActivity).resourceProvider;
                        uo7Var = new uo7(this.e, 21, 64, true, vnbVar);
                        break;
                    case 7:
                    default:
                        uo7Var = new skb(context);
                        break;
                    case 8:
                        ?? skbVar = new skb(context);
                        ImageView imageView = new ImageView(context);
                        skbVar.a0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        yob.s(imageView, aob.v6, notificationsCustomSettingsActivity.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                        imageView.setImageResource(2131232135);
                        if (ob6.a0) {
                            i3 = 3;
                        }
                        skbVar.addView(imageView, tre.d(24, 24.0f, i3 | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                        uo7Var = skbVar;
                        break;
                }
                return new f89(uo7Var);
        }
    }

    @Override
    public final void y(f89 f89Var) {
        boolean v;
        qp7 qp7Var;
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
                    int b = f89Var.b();
                    View view = f89Var.a;
                    if (b >= 0 && b < arrayList3.size()) {
                        qp7Var = (qp7) arrayList3.get(b);
                    } else {
                        qp7Var = null;
                    }
                    if (qp7Var == null || qp7Var.c != 102) {
                        int i2 = f89Var.f;
                        if (i2 != 0) {
                            if (i2 != 1) {
                                if (i2 != 3) {
                                    if (i2 == 5) {
                                        ((qmb) view).a(null, v);
                                        return;
                                    }
                                    return;
                                }
                                ((ykb) view).a(null, v);
                                return;
                            }
                            ((wkb) view).e(null, v);
                            return;
                        }
                        ((mf5) view).a(null, v);
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
