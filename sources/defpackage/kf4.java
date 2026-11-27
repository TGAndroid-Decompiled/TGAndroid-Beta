package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class kf4 extends la {
    public final Context d;
    public final nf4 e;

    public kf4(nf4 nf4Var, Context context) {
        this.e = nf4Var;
        this.d = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        if (i != 3 && i != 0 && i != 2 && i != 5 && i != 9 && i != 11) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.e.Q.size();
    }

    @Override
    public final int d(int i) {
        ef4 ef4Var = (ef4) this.e.Q.get(i);
        if (ef4Var == null) {
            return 3;
        }
        return ef4Var.a;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        boolean z;
        String M0;
        String M02;
        int i2;
        int i3;
        int i4;
        nf4 nf4Var = this.e;
        ArrayList arrayList = nf4Var.Q;
        ef4 ef4Var = (ef4) arrayList.get(i);
        if (ef4Var != null) {
            int i5 = i + 1;
            boolean z2 = false;
            if (i5 < arrayList.size() && (i4 = ((ef4) arrayList.get(i5)).a) != 3 && i4 != 6) {
                z = true;
            } else {
                z = false;
            }
            int i6 = f89Var.f;
            View view = f89Var.a;
            if (i6 != 0) {
                if (i6 != 1) {
                    int i7 = -1;
                    if (i6 != 4) {
                        switch (i6) {
                            case 6:
                                ((ilb) view).setText(ef4Var.d);
                                return;
                            case 7:
                                ((hf4) view).e(ef4Var.m, z);
                                return;
                            case 8:
                                we4 we4Var = (we4) view;
                                if (we4Var.c != z) {
                                    we4Var.c = z;
                                    we4Var.setWillNotDraw(!z);
                                    return;
                                }
                                return;
                            case 9:
                                cf4 cf4Var = (cf4) view;
                                nf4Var.J = cf4Var;
                                cf4Var.e(hm.cloneSpans(nf4Var.x, -1, cf4Var.s.getPaint().getFontMetricsInt(), 0.5f), false);
                                cf4 cf4Var2 = nf4Var.J;
                                if (nf4Var.getUserConfig().p()) {
                                    i7 = nf4Var.F;
                                }
                                cf4Var2.d(i7, false);
                                nf4Var.J.setText(ob6.M0(2131750582, null));
                                return;
                            case 10:
                                d48 d48Var = (d48) view;
                                d48Var.setCloseAsLock(!nf4Var.getUserConfig().p());
                                if (nf4Var.getUserConfig().p()) {
                                    i7 = nf4Var.F;
                                }
                                d48Var.a(i7, false);
                                d48Var.setOnColorClick(new rx1(this, d48Var, (byte) 21));
                                return;
                            case 11:
                                df4 df4Var = (df4) view;
                                nf4Var.K = df4Var;
                                df4Var.setText(ef4Var.d);
                                si siVar = df4Var.r;
                                siVar.setText(ef4Var.e);
                                siVar.setOnClickListener(ef4Var.c);
                                return;
                            default:
                                return;
                        }
                    }
                    ue4 ue4Var = (ue4) view;
                    boolean z3 = ef4Var.l;
                    ImageView imageView = ue4Var.a;
                    TextView textView = ue4Var.b;
                    if (z3) {
                        i2 = aob.q7;
                    } else {
                        i2 = aob.o6;
                    }
                    yob.s(imageView, i2, null, PorterDuff.Mode.MULTIPLY);
                    if (z3) {
                        i3 = aob.p7;
                    } else {
                        i3 = aob.q6;
                    }
                    yob.X(textView, i3, null);
                    int i8 = ef4Var.k;
                    String str = ef4Var.d;
                    ImageView imageView2 = ue4Var.a;
                    if (!ob6.a0) {
                        i7 = 1;
                    }
                    if (i8 == 0) {
                        imageView2.setVisibility(8);
                    } else {
                        imageView2.setVisibility(0);
                        imageView2.setImageResource(i8);
                    }
                    float f = 72.0f;
                    if (ob6.a0) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                        if (i8 == 0) {
                            f = 24.0f;
                        }
                        marginLayoutParams.rightMargin = hl.L(f);
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                        if (i8 == 0) {
                            f = 24.0f;
                        }
                        marginLayoutParams2.leftMargin = hl.L(f);
                    }
                    textView.setText(str);
                    if (!z && i8 != 0) {
                        z2 = true;
                    }
                    Boolean bool = ue4Var.e;
                    if (bool == null || bool.booleanValue() != z2) {
                        ue4Var.e = Boolean.valueOf(z2);
                        float f2 = 0.0f;
                        if (ue4Var.c == i8) {
                            textView.clearAnimation();
                            ViewPropertyAnimator animate = textView.animate();
                            if (z2) {
                                f2 = hl.L(i7 * (-7));
                            }
                            animate.translationX(f2).setDuration(180L).setInterpolator(k43.h).start();
                        } else {
                            if (z2) {
                                f2 = hl.L(i7 * (-7));
                            }
                            textView.setTranslationX(f2);
                        }
                    }
                    ue4Var.d = z;
                    ue4Var.setWillNotDraw(!z);
                    ue4Var.c = i8;
                    return;
                }
                vac vacVar = (vac) view;
                String str2 = ef4Var.i;
                if (str2 != null) {
                    vacVar.d(str2, ef4Var.d, null, z);
                    return;
                }
                long j = ef4Var.h;
                if (j > 0) {
                    TLRPC.User X1 = nf4Var.getMessagesController().X1(Long.valueOf(j));
                    if (X1 != null) {
                        if (X1.bot) {
                            M02 = ob6.M0(2131753149, null);
                        } else if (X1.contact) {
                            M02 = ob6.M0(2131750757, null);
                        } else {
                            M02 = ob6.M0(2131750684, null);
                        }
                        vacVar.d(X1, null, M02, z);
                        return;
                    }
                    return;
                }
                TLRPC.Chat M03 = nf4Var.getMessagesController().M0(Long.valueOf(-j));
                if (M03 != null) {
                    if (xc2.Y(M03)) {
                        M0 = ob6.M0(2131751955, null);
                    } else if (M03.participants_count != 0) {
                        boolean V = xc2.V(M03);
                        int i9 = M03.participants_count;
                        if (V) {
                            M0 = ob6.H(',', "Subscribers", i9);
                        } else {
                            M0 = ob6.H(',', "Members", i9);
                        }
                    } else if (!xc2.t0(M03)) {
                        if (xc2.T(M03) && !M03.megagroup) {
                            M0 = ob6.M0(2131752299, null);
                        } else {
                            M0 = ob6.M0(2131748395, null);
                        }
                    } else if (xc2.T(M03) && !M03.megagroup) {
                        M0 = ob6.M0(2131752288, null);
                    } else {
                        M0 = ob6.M0(2131748392, null);
                    }
                    vacVar.d(M03, null, M0, z);
                    return;
                }
                return;
            }
            mf5 mf5Var = (mf5) view;
            boolean z4 = ef4Var.f;
            String str3 = ef4Var.d;
            if (z4) {
                mf5Var.setText(nf4.E0(0, str3, false));
            } else {
                mf5Var.setText(str3);
            }
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        vnb vnbVar;
        int i2;
        vac vacVar;
        int i3;
        int i4;
        float f;
        float f2;
        View view;
        int i5;
        int i6;
        vnb vnbVar2;
        vnb vnbVar3;
        Context context = this.d;
        nf4 nf4Var = this.e;
        switch (i) {
            case 0:
                view = new mf5(context, 22);
                vacVar = view;
                break;
            case 1:
                vac vacVar2 = new vac(context, 6, 0, false);
                vacVar2.setSelfAsSavedMessages(true);
                vacVar = vacVar2;
                break;
            case 2:
                String M0 = ob6.M0(2131750697, null);
                vnbVar = ((e) nf4Var).resourceProvider;
                ?? ot3Var = new ot3(this.d, (wma) nf4Var.fragmentView, M0, false, 12, vnbVar);
                nf4Var.L = ot3Var;
                ot3Var.r = false;
                ot3Var.s = true;
                lt3 lt3Var = ot3Var.b;
                lt3Var.getEditText().setEmojiColor(Integer.valueOf(nf4Var.getThemedColor(aob.Fi)));
                lt3Var.setEmojiViewCacheType(25);
                lt3Var.setText(nf4Var.x);
                i2 = ((e) nf4Var).currentAccount;
                wl.r(i2, nf4Var.y);
                xt3 editText = lt3Var.getEditText();
                editText.addTextChangedListener(new gi());
                editText.addTextChangedListener(new c7(this, (byte) 23));
                editText.setPadding(hl.L(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                lt3Var.getEditText().setImeOptions(268435462);
                vacVar = ot3Var;
                break;
            case 3:
                vacVar = new sca(context, (uh9) null);
                break;
            case 4:
                ?? frameLayout = new FrameLayout(context);
                frameLayout.d = true;
                frameLayout.e = null;
                ImageView imageView = new ImageView(context);
                frameLayout.a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i7 = 3;
                if (ob6.a0) {
                    i3 = 5;
                } else {
                    i3 = 3;
                }
                frameLayout.addView(imageView, tre.d(24, 24.0f, i3 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                int i8 = 24;
                if (ob6.a0) {
                    i4 = 24;
                    i8 = 0;
                } else {
                    i4 = 0;
                }
                textView.setPadding(i4, 0, i8, 0);
                if (ob6.a0) {
                    i7 = 5;
                }
                textView.setGravity(i7);
                boolean z = ob6.a0;
                if (z) {
                    f = 0.0f;
                } else {
                    f = 72.0f;
                }
                if (z) {
                    f2 = 72.0f;
                } else {
                    f2 = 0.0f;
                }
                frameLayout.addView(textView, tre.d(-1, -2.0f, 23, f, 0.0f, f2, 0.0f));
                vacVar = frameLayout;
                break;
            case 5:
                zc zcVar = new zc(context, (byte) 22);
                ?? imageView2 = new ImageView(context);
                zcVar.b = imageView2;
                imageView2.f(2131624016, 100, 100, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                zcVar.addView((View) imageView2, tre.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new mh3(zcVar, (byte) 13));
                view = zcVar;
                vacVar = view;
                break;
            case 6:
            default:
                vacVar = new ilb(context);
                break;
            case 7:
                i5 = ((e) nf4Var).currentAccount;
                vacVar = new jf4(this, this.d, nf4Var, i5, nf4Var.r.a);
                break;
            case 8:
                vacVar = new we4(context);
                break;
            case 9:
                vacVar = new cf4(nf4Var, context);
                break;
            case 10:
                Activity parentActivity = nf4Var.getParentActivity();
                i6 = ((e) nf4Var).currentAccount;
                vnbVar2 = ((e) nf4Var).resourceProvider;
                vacVar = new d48(2, i6, vnbVar2, parentActivity);
                break;
            case 11:
                vnbVar3 = ((e) nf4Var).resourceProvider;
                vacVar = new df4(context, vnbVar3);
                break;
        }
        return new f89(vacVar);
    }

    @Override
    public final void y(f89 f89Var) {
        int i = f89Var.f;
        if (i != 2 && i == 9) {
            nf4 nf4Var = this.e;
            ((cf4) f89Var.a).e(hm.cloneSpans(nf4Var.x, -1, nf4Var.J.s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(f89 f89Var) {
        if (f89Var.f == 2) {
            ot3 ot3Var = (ot3) f89Var.a;
            ot3Var.b.k(true);
            ot3Var.b.d();
        }
    }
}
