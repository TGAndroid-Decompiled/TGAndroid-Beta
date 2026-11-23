package di;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ay0;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b61;
import org.telegram.ui.bn;
import org.telegram.ui.q00;
import org.telegram.ui.r00;
import org.telegram.ui.r50;
import org.telegram.ui.rn;
import org.telegram.ui.tv;
public final class pb extends r00 implements fs {
    public static DecimalFormat f9525w0;
    public static DecimalFormat f9526x0;
    public FrameLayout S;
    public vg.m T;
    public ob U;
    public st0 V;
    public bi.o3 W;
    public View X;
    public te.a Y;
    public te.a Z;
    public te.a f9527a0;
    public int f9529c0;
    public int f9530d0;
    public boolean f9531e0;
    public boolean f9532f0;
    public bi.o3 f9534h0;
    public tz f9535i0;
    public LinearLayout f9536j0;
    public SpannableStringBuilder f9537k0;
    public org.telegram.ui.Components.n6 f9538l0;
    public TextView m0;
    public hi.e f9539n0;
    public bi.g3 f9540o0;
    public hi.e f9541p0;
    public b61 f9542q0;
    public hi.e f9543r0;
    public hi.e f9544s0;
    public boolean f9545t0;
    public boolean f9546u0;
    public bi.j8 f9547v0;
    public int f9528b0 = -1;
    public final ca.r f9533g0 = new ca.r(this, 23);

    public pb() {
        this.N = true;
    }

    public static void A0(pb pbVar, Context context) {
        if (mp.u1(pbVar.currentAccount).A2()) {
            org.telegram.ui.b.b(pbVar.currentAccount);
        } else {
            new gb(context, pbVar.resourceProvider).show();
        }
    }

    public static void B0(pb pbVar) {
        y8.y(pbVar.currentAccount, false).u();
        bi.f2.l1(true, org.telegram.messenger.v1.a(pbVar.currentAccount).b());
    }

    public static void C0(di.pb r43, int r44) {
        throw new UnsupportedOperationException("Method not decompiled: di.pb.C0(di.pb, int):void");
    }

    public static void D0(pb pbVar, n41 n41Var, Boolean bool, String str) {
        if (pbVar.getParentActivity() != null) {
            if (bool.booleanValue()) {
                org.telegram.ui.Components.kc.b0(pbVar).I(2131624227, gd.N0(2131744918, null), org.telegram.messenger.g0.W2(gd.G((int) n41Var.C, "StarsAcquiredInfo", new Object[0]))).j();
                pbVar.f9535i0.c(true);
                y8.y(pbVar.currentAccount, false).R(true);
            } else if (str != null) {
                org.telegram.ui.Components.kc.b0(pbVar).Q(2131624012, 36, gd.a0(null, null, 2131743631, str)).j();
            }
        }
    }

    public static void H0(dy0 dy0Var, int i7, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.i6 i6Var) {
        CharSequence K;
        CharSequence charSequence;
        TextView textView = (TextView) ((ay0) dy0Var.e(gd.N0(2131750283, null), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        o80 o80Var = new o80(textView, org.telegram.messenger.g0.L(90.0f), 0, i6Var);
        o80Var.a(org.telegram.ui.ActionBar.n6.r1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.n6.r1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(o80Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (!starGift.sold_out) {
            final y8 y10 = y8.y(i7, false);
            final long j3 = starGift.f28721id;
            final ai.d0 d0Var = new ai.d0(textView, 14);
            final boolean[] zArr = {false};
            final fs[] fsVarArr = {new fs() {
                @Override
                public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
                    int i12;
                    y8 y8Var;
                    TL_stars.StarGift J;
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0] && i10 == (i12 = ks.H3) && (J = (y8Var = y8.this).J(j3)) != null) {
                        zArr2[0] = true;
                        ks.f(y8Var.f10046a).n(fsVarArr[0], i12);
                        d0Var.a(J);
                    }
                }
            }};
            int i10 = y10.f10046a;
            ks f10 = ks.f(i10);
            fs fsVar = fsVarArr[0];
            int i11 = ks.H3;
            f10.b(fsVar, i11);
            TL_stars.StarGift J = y10.J(j3);
            if (J != null) {
                zArr[0] = true;
                ks.f(i10).n(fsVarArr[0], i11);
                d0Var.a(J);
            }
        } else if (starGift instanceof TL_stars.TL_starGiftUnique) {
            if (starGift.availability_remains <= 0) {
                charSequence = gd.H(',', "Gift2QuantityIssuedNone", starGift.availability_total);
            } else {
                charSequence = gd.H(',', "Gift2QuantityIssued1", starGift.availability_issued) + gd.H(',', "Gift2QuantityIssued2", starGift.availability_total);
            }
            textView.setText(charSequence);
        } else {
            int i12 = starGift.availability_remains;
            if (i12 <= 0) {
                K = gd.H(',', "Gift2Availability2ValueNone", starGift.availability_total);
            } else {
                K = gd.K("Gift2Availability4Value", i12, ',', gd.E(starGift.availability_total, ','));
            }
            textView.setText(K);
        }
    }

    public static void I0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ra(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder L0(TL_stars.StarsAmount starsAmount) {
        return M0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder M0(TL_stars.StarsAmount starsAmount, float f10, char c10) {
        double d;
        int i7;
        if (f9526x0 == null) {
            f9526x0 = new DecimalFormat("0.###", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            long j3 = starsAmount.amount;
            if (j3 % 1000000000 != 0) {
                String format = f9526x0.format(j3 / 1.0E9d);
                spannableStringBuilder.append((CharSequence) format);
                int indexOf = format.indexOf(".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), indexOf, spannableStringBuilder.length(), 33);
                    return spannableStringBuilder;
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (starsAmount.negative()) {
                    str = "-";
                }
                sb2.append(str);
                sb2.append(gd.E(Math.abs(starsAmount.amount / 1000000000), c10));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                return spannableStringBuilder;
            }
        } else {
            long j10 = starsAmount.amount;
            int i10 = starsAmount.nanos;
            boolean z10 = false;
            if (i10 < 0 && j10 > 0) {
                i7 = -1;
                d = 1.0E9d;
            } else if (i10 > 0 && j10 < 0) {
                d = 1.0E9d;
                i7 = 1;
            } else {
                d = 1.0E9d;
                i7 = 0;
            }
            long j11 = i7 + j10;
            int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i11 != 0 ? i11 < 0 : i10 < 0) {
                z10 = true;
            }
            if (i10 != 0) {
                StringBuilder sb3 = new StringBuilder();
                if (z10) {
                    str = "-";
                }
                sb3.append(str);
                sb3.append(gd.E(Math.abs(j11), c10));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                DecimalFormat decimalFormat = f9526x0;
                int i12 = starsAmount.nanos;
                double d2 = i12;
                if (i12 < 0) {
                    d2 += d;
                }
                String format2 = decimalFormat.format(d2 / d);
                int indexOf2 = format2.indexOf(".");
                if (indexOf2 >= 0) {
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) format2.substring(indexOf2));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), length + 1, spannableStringBuilder.length(), 33);
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                if (z10) {
                    str = "-";
                }
                sb4.append(str);
                sb4.append(gd.E(Math.abs(j11), c10));
                spannableStringBuilder.append((CharSequence) sb4.toString());
                return spannableStringBuilder;
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder N0(TL_stars.StarsAmount starsAmount, float f10, char c10) {
        double d;
        int i7;
        boolean z10;
        if (f9526x0 == null) {
            f9526x0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            String format = f9526x0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), indexOf, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
        } else {
            long j3 = starsAmount.amount;
            int i10 = starsAmount.nanos;
            if (i10 < 0 && j3 > 0) {
                i7 = -1;
                d = 1.0E9d;
            } else if (i10 > 0 && j3 < 0) {
                d = 1.0E9d;
                i7 = 1;
            } else {
                d = 1.0E9d;
                i7 = 0;
            }
            long j10 = i7 + j3;
            int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i11 != 0 ? i11 < 0 : i10 < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            String str = "";
            if (Math.abs(j10) <= 1000 && starsAmount.nanos != 0) {
                StringBuilder sb2 = new StringBuilder();
                if (z10) {
                    str = "-";
                }
                sb2.append(str);
                sb2.append(gd.E(Math.abs(j10), c10));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                DecimalFormat decimalFormat = f9526x0;
                int i12 = starsAmount.nanos;
                double d2 = i12;
                if (i12 < 0) {
                    d2 += d;
                }
                String format2 = decimalFormat.format(d2 / d);
                int indexOf2 = format2.indexOf(".");
                if (indexOf2 >= 0) {
                    int length = spannableStringBuilder.length();
                    String substring = format2.substring(indexOf2);
                    if (substring.length() > 1) {
                        spannableStringBuilder.append((CharSequence) substring.substring(0, Math.min(substring.length(), 3)));
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), length + 1, spannableStringBuilder.length(), 33);
                    }
                }
            } else if (starsAmount.amount <= 1000) {
                StringBuilder sb3 = new StringBuilder();
                if (z10) {
                    str = "-";
                }
                sb3.append(str);
                sb3.append(gd.E(Math.abs(j10), c10));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                return spannableStringBuilder;
            } else {
                StringBuilder sb4 = new StringBuilder();
                if (z10) {
                    str = "-";
                }
                sb4.append(str);
                sb4.append(org.telegram.messenger.g0.o0((int) Math.abs(j10), 0));
                spannableStringBuilder.append((CharSequence) sb4.toString());
                return spannableStringBuilder;
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder O0(TL_stars.StarsAmount starsAmount) {
        double d;
        int i7;
        String str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            if (f9526x0 == null) {
                f9526x0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            String format = f9526x0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.777f), indexOf, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j3 = starsAmount.amount;
        int i10 = starsAmount.nanos;
        boolean z10 = false;
        if (i10 < 0 && j3 > 0) {
            i7 = -1;
            d = 1.0E9d;
        } else if (i10 > 0 && j3 < 0) {
            d = 1.0E9d;
            i7 = 1;
        } else {
            d = 1.0E9d;
            i7 = 0;
        }
        long j10 = i7 + j3;
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i11 != 0 ? i11 < 0 : i10 < 0) {
            z10 = true;
        }
        if (i10 != 0) {
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                str = "-";
            } else {
                str = "";
            }
            sb2.append(str);
            sb2.append(gd.E(Math.abs(j10), ','));
            spannableStringBuilder.append((CharSequence) sb2.toString());
            if (f9526x0 == null) {
                f9526x0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            DecimalFormat decimalFormat = f9526x0;
            int i12 = starsAmount.nanos;
            double d2 = i12;
            if (i12 < 0) {
                d2 += d;
            }
            String format2 = decimalFormat.format(d2 / d);
            int indexOf2 = format2.indexOf(".");
            if (indexOf2 >= 0) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) format2.substring(indexOf2));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.777f), length + 1, spannableStringBuilder.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) gd.N0(2131744843, null));
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) gd.H(',', "Stars", (int) j3));
        return spannableStringBuilder;
    }

    public static String P0(long j3) {
        String str;
        if (f9525w0 == null) {
            f9525w0 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j3 % 1000000000 != 0) {
            return f9525w0.format(j3 / 1.0E9d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (j3 < 0) {
            str = "-";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(gd.E(Math.abs(j3 / 1000000000), ','));
        return sb2.toString();
    }

    public static java.lang.String Q0(int r6, boolean r7, org.telegram.tgnet.tl.TL_stars.StarsTransaction r8) {
        throw new UnsupportedOperationException("Method not decompiled: di.pb.Q0(int, boolean, org.telegram.tgnet.tl.TL_stars$StarsTransaction):java.lang.String");
    }

    public static SpannableStringBuilder R0(CharSequence charSequence, float f10) {
        return S0(charSequence, f10, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder S0(CharSequence charSequence, float f10, float f11, float f12) {
        SpannableStringBuilder spannableStringBuilder;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof SpannableStringBuilder)) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        }
        SpannableString spannableString = new SpannableString("💎 ");
        kq kqVar = new kq(2131231056, 0);
        kqVar.d = false;
        kqVar.f36853r = 0.0f;
        kqVar.f36854s = f11;
        kqVar.H = f12;
        kqVar.I = f10;
        kqVar.J = f10;
        spannableString.setSpan(kqVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, "💎", "💎️");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "💎", "💎 ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "💎");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder T0(CharSequence charSequence) {
        return U0(charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder U0(CharSequence charSequence, float f10, kq[] kqVarArr) {
        return Y0(false, charSequence, f10, kqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder V0(CharSequence charSequence, boolean z10) {
        return X0(z10, charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder W0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return X0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null);
    }

    public static SpannableStringBuilder X0(boolean z10, CharSequence charSequence, float f10, kq[] kqVarArr) {
        return Y0(z10, charSequence, f10, kqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder Y0(boolean z10, CharSequence charSequence, float f10, kq[] kqVarArr, float f11, float f12) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        kq kqVar;
        int i7;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof SpannableStringBuilder)) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        }
        if (!z10) {
            str = "⭐";
        } else {
            str = "TON";
        }
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (kqVarArr == null || (kqVar = kqVarArr[0]) == null) {
            if (z10) {
                i7 = 2131231961;
            } else {
                i7 = 2131232312;
            }
            kqVar = new kq(i7, 0);
            if (kqVarArr != null) {
                kqVarArr[0] = kqVar;
            }
        }
        kqVar.f36853r = 0.0f;
        kqVar.f36854s = f11;
        kqVar.H = f12;
        if (z10) {
            kqVar.d = false;
            float f13 = f10 * 0.2f;
            kqVar.I = f13;
            kqVar.J = f13;
        } else {
            kqVar.I = f10;
            kqVar.J = f10;
        }
        spannableString.setSpan(kqVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder Z0(boolean z10, String str, kq[] kqVarArr) {
        kq kqVar;
        int i7;
        float f10;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (kqVarArr == null || (kqVar = kqVarArr[0]) == null) {
            if (z10) {
                i7 = 2131231961;
            } else {
                i7 = 2131232312;
            }
            kqVar = new kq(i7, 0);
            float f11 = 1.13f;
            if (z10) {
                f10 = 0.222f;
            } else {
                f10 = 1.13f;
            }
            if (z10) {
                f11 = 0.222f;
            }
            kqVar.I = f10;
            kqVar.J = f11;
        }
        if (z10) {
            kqVar.d = false;
        }
        if (kqVarArr != null) {
            kqVarArr[0] = kqVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(kqVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder a1(TL_stars.StarsAmount starsAmount, String str, kq[] kqVarArr) {
        return b1(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, kqVarArr);
    }

    public static SpannableStringBuilder b1(boolean z10, CharSequence charSequence, float f10, kq[] kqVarArr) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        int i7;
        kq kqVar;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof SpannableStringBuilder)) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        }
        if (!z10) {
            str = "⭐";
        } else {
            str = "TON";
        }
        if (z10) {
            i7 = 2131231961;
        } else {
            i7 = 2131232757;
        }
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (kqVarArr == null || (kqVar = kqVarArr[0]) == null) {
            if (kqVarArr != null && kqVarArr.length > 0) {
                kqVar = new kq(i7, 0);
                kqVarArr[0] = kqVar;
            } else {
                kqVar = new kq(i7, 0);
            }
        }
        kqVar.d = false;
        if (z10) {
            f10 *= 0.33f;
        }
        kqVar.I = f10;
        kqVar.J = f10;
        spannableString.setSpan(kqVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static fa c1(View view, ImageReceiver imageReceiver, String str, boolean z10) {
        int i7;
        int i10 = imageReceiver.d;
        final da daVar = new da(z10, i10, str, imageReceiver, new boolean[1]);
        daVar.run();
        ks f10 = ks.f(i10);
        if (z10) {
            i7 = ks.Z2;
        } else {
            i7 = ks.Y2;
        }
        return new fa(f10.h(view, i7, new w10() {
            @Override
            public final void a(Object obj) {
                Object[] objArr = (Object[]) obj;
                switch (r2) {
                    case 0:
                        daVar.run();
                        return;
                    default:
                        daVar.run();
                        return;
                }
            }
        }), ks.f(i10).h(view, ks.f25324y0, new w10() {
            @Override
            public final void a(Object obj) {
                Object[] objArr = (Object[]) obj;
                switch (r2) {
                    case 0:
                        daVar.run();
                        return;
                    default:
                        daVar.run();
                        return;
                }
            }
        }), 0);
    }

    public static void d1(ImageReceiver imageReceiver, TLRPC.Document document, int i7) {
        if (document == null) {
            imageReceiver.f();
            return;
        }
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, i7, false, null, false);
        imageReceiver.s0(org.telegram.messenger.fc.b(document), com.google.android.gms.internal.vision.e2.j(i7, "_", i7), org.telegram.messenger.fc.c(w10, document), com.google.android.gms.internal.vision.e2.j(i7, "_", i7), org.telegram.messenger.u5.d(document.thumbs, org.telegram.ui.ActionBar.n6.f29394a7, 0.35f, false), 0L, null, null, 0);
    }

    public static void e1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i7) {
        TLRPC.Document document;
        if (starGift == null) {
            document = null;
        } else {
            document = starGift.getDocument();
        }
        d1(imageReceiver, document, i7);
    }

    public static void f1(org.telegram.ui.Components.p9 p9Var, ImageReceiver imageReceiver, long j3) {
        String str;
        if (j3 <= 1000) {
            str = "2⃣";
        } else if (j3 < 2500) {
            str = "3⃣";
        } else {
            str = "4⃣";
        }
        c1(p9Var, imageReceiver, str, false);
    }

    public static fa g1(org.telegram.ui.Components.p9 p9Var, ImageReceiver imageReceiver, int i7) {
        String str;
        if (i7 != 3) {
            if (i7 != 6) {
                if (i7 != 12) {
                    if (i7 != 24) {
                        str = "1⃣";
                    } else {
                        str = "5⃣";
                    }
                } else {
                    str = "4⃣";
                }
            } else {
                str = "3⃣";
            }
        } else {
            str = "2⃣";
        }
        return c1(p9Var, imageReceiver, str, false);
    }

    public static void h1(org.telegram.ui.Components.p9 p9Var, ImageReceiver imageReceiver, long j3) {
        String str;
        if (j3 <= 10000000000L) {
            str = "2⃣";
        } else if (j3 <= 50000000000L) {
            str = "1⃣";
        } else {
            str = "3⃣";
        }
        c1(p9Var, imageReceiver, str, true);
    }

    public static void i1(Context context, int i7, long j3, TL_stories.Boost boost, org.telegram.ui.ActionBar.i6 i6Var) {
        ?? r18;
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.w2 j10 = org.telegram.messenger.f3.j(1, context, i6Var, false);
        ?? g10 = org.telegram.messenger.f3.g(context, 1);
        g10.setPadding(0, org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(4.0f));
        g10.setClipChildren(false);
        g10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        g10.addView(frameLayout, c8.na.t(-1, 150, 7, 0, 0, 0, 10));
        ua uaVar = new ua(context, 70, 0, 0);
        frameLayout.addView(uaVar, c8.na.c(-1.0f, -1));
        vg.m mVar = new vg.m(context, 1, 2);
        vg.f fVar = mVar.f59590b;
        fVar.f59574z = org.telegram.ui.ActionBar.n6.Wk;
        fVar.A = org.telegram.ui.ActionBar.n6.Xk;
        fVar.b();
        mVar.setStarParticlesView(uaVar);
        frameLayout.addView(mVar, c8.na.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        mVar.setPaused(false);
        TextView textView = new TextView(context);
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.f29559j5, i6Var, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.w2[] w2VarArr = new org.telegram.ui.ActionBar.w2[1];
        textView.setText(gd.H(' ', "BoostStars", (int) boost.stars));
        ?? f10 = m10.f(g10, textView, c8.na.t(-1, -2, 17, 20, 0, 20, 4), context);
        f10.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(20.0f), -6915073));
        f10.setTextColor(-1);
        f10.setTextSize(1, 11.33f);
        f10.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(8.33f), 0);
        f10.setGravity(17);
        f10.setTypeface(org.telegram.messenger.g0.o());
        StringBuilder sb2 = new StringBuilder("x");
        int i10 = boost.multiplier;
        if (i10 == 0) {
            i10 = 1;
        }
        sb2.append(gd.H(' ', "BoostingBoostsCount", i10));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        kq kqVar = new kq(2131231932, 2);
        kqVar.f36853r = 0.0f;
        kqVar.f36854s = org.telegram.messenger.g0.L(0.66f);
        spannableStringBuilder.setSpan(kqVar, 0, 1, 33);
        f10.setText(spannableStringBuilder);
        g10.addView(f10, c8.na.t(-2, 20, 17, 20, 4, 20, 4));
        dy0 dy0Var = new dy0(context, i6Var);
        dy0Var.n(gd.N0(2131753624, null), i7, j3, new i9(w2VarArr, j3, 6));
        dy0Var.e(gd.N0(2131753623, null), gd.G((int) boost.stars, "BoostStars", new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String N0 = gd.N0(2131753612, null);
            String N02 = gd.N0(2131753611, null);
            r18 = 0;
            bi.s2 s2Var = new bi.s2(w2VarArr, j3, boost, 4);
            w2VarArr = w2VarArr;
            dy0Var.i(N0, N02, s2Var);
        } else {
            r18 = 0;
        }
        String N03 = gd.N0(2131753659, null);
        String format = gd.E0().s0().format(new Date(boost.date * 1000));
        String format2 = gd.E0().p0().format(new Date(boost.date * 1000));
        Object[] objArr = new Object[2];
        objArr[r18] = format;
        objArr[1] = format2;
        dy0Var.e(N03, gd.a0(null, null, 2131742512, objArr), null, null);
        String N04 = gd.N0(2131753604, null);
        String format3 = gd.E0().s0().format(new Date(boost.expires * 1000));
        String format4 = gd.E0().p0().format(new Date(boost.expires * 1000));
        Object[] objArr2 = new Object[2];
        objArr2[r18] = format3;
        objArr2[1] = format4;
        dy0Var.e(N04, gd.a0(null, null, 2131742512, objArr2), null, null);
        g10.addView(dy0Var, c8.na.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        j80 j80Var = new j80(context, i6Var);
        org.telegram.ui.ActionBar.u6.U(j80Var, org.telegram.ui.ActionBar.n6.f29862z6, i6Var);
        org.telegram.ui.ActionBar.u6.G(j80Var, org.telegram.ui.ActionBar.n6.Xc, i6Var);
        j80Var.setTextSize(1, 14.0f);
        j80Var.setText(org.telegram.messenger.g0.T2(gd.N0(2131744685, null), new bi.h2(context, 3)));
        j80Var.setGravity(17);
        g10.addView(j80Var, c8.na.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        hi.e eVar = new hi.e(context, i6Var, true);
        eVar.i(gd.N0(2131747637, null), r18, true);
        eVar.setOnClickListener(new ai.k2(w2VarArr, 2));
        g10.addView(eVar, c8.na.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        j10.O = g10;
        w2VarArr[0] = j10;
        j10.U0 = false;
        j10.O();
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(T)) {
            w2VarArr[0].a0(T);
        }
        mVar.setPaused(false);
        w2VarArr[0].show();
        w2VarArr[0].n(new ca.r(mVar, 24));
    }

    public static u0 j1(Context context, int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique, p10 p10Var, org.telegram.ui.ActionBar.i6 i6Var) {
        cg.a resellAmount;
        cg.b bVar = cg.b.f5268a;
        if (tL_starGiftUnique == null) {
            resellAmount = cg.a.h(((org.telegram.messenger.j0) mp.u1(i7).A7.f26253p.f15482b).f24899c, bVar);
        } else if (tL_starGiftUnique.resale_ton_only) {
            resellAmount = tL_starGiftUnique.getResellAmount(cg.b.f5269b);
        } else {
            resellAmount = tL_starGiftUnique.getResellAmount(bVar);
        }
        u0 u0Var = new u0(context, i6Var, i7, resellAmount, new ai.s1(13, p10Var, r8));
        u0[] u0VarArr = {u0Var};
        u0Var.show();
        return u0VarArr[0];
    }

    public static void k1(Context context, long j3, boolean z10, final p10 p10Var, org.telegram.ui.ActionBar.i6 i6Var) {
        int i7;
        int i10;
        CharSequence l10;
        org.telegram.ui.ActionBar.w2[] w2VarArr;
        long j10;
        boolean z11 = false;
        org.telegram.ui.ActionBar.w2 j11 = org.telegram.messenger.f3.j(1, context, i6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        hi.e eVar = null;
        textView.setText(gd.N0(2131747538, null));
        textView.setTextSize(1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(textView, i11, i6Var);
        linearLayout.addView(textView, c8.na.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        vb0 vb0Var = new vb0(context, i6Var);
        vb0Var.setForceForceUseCenter(true);
        vb0Var.setText(gd.N0(2131747539, null));
        vb0Var.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
        org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, i11, i6Var);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int L = org.telegram.messenger.g0.L(16.0f);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(6.0f), L, L, L);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        org.telegram.ui.ActionBar.u6.C(editTextBoldCursor, org.telegram.ui.ActionBar.n6.f29607lg, i6Var);
        org.telegram.ui.ActionBar.u6.l(editTextBoldCursor, 36, org.telegram.ui.ActionBar.n6.f29624mg, i6Var);
        if (gd.f24314a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        editTextBoldCursor.setGravity(i7);
        editTextBoldCursor.setOnFocusChangeListener(new r9(vb0Var, editTextBoldCursor, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232757);
        linearLayout2.addView(imageView, c8.na.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, c8.na.p(-1, -2, 1.0f, 119));
        vb0Var.e(editTextBoldCursor);
        vb0Var.addView(linearLayout2, c8.na.e(-1, -2, 48));
        linearLayout.addView(vb0Var, c8.na.o(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.A6, null);
        vb0Var.addView(textView2, c8.na.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        j80 j80Var = new j80(context, null);
        j80Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(gd.N0(2131747541, null), new bi.h2(context, 4)), true));
        j80Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.u6.U(j80Var, org.telegram.ui.ActionBar.n6.f29862z6, i6Var);
        org.telegram.ui.ActionBar.u6.G(j80Var, org.telegram.ui.ActionBar.n6.Xc, i6Var);
        linearLayout.addView(j80Var, c8.na.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final hi.e g10 = m10.g(24, context, i6Var, true);
        int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i12 > 0) {
            i10 = 2131747537;
        } else {
            i10 = 2131747543;
        }
        g10.i(gd.N0(i10, null), false, true);
        linearLayout.addView(g10, c8.na.o(-1, 48));
        if (i12 > 0 && z10) {
            hi.e g11 = m10.g(24, context, i6Var, false);
            g11.i(gd.N0(2131747542, null), false, false);
            linearLayout.addView(g11, c8.na.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
            eVar = g11;
        }
        j11.O = linearLayout;
        final org.telegram.ui.ActionBar.w2[] w2VarArr2 = {j11};
        if (i12 <= 0) {
            l10 = "";
        } else {
            l10 = Long.toString(j3);
        }
        editTextBoldCursor.setText(l10);
        editTextBoldCursor.addTextChangedListener(new sa(editTextBoldCursor, vb0Var, j3, z10, g10, textView2));
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView3, int i13, KeyEvent keyEvent) {
                if (i13 != 5) {
                    return false;
                }
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return true;
                }
                zArr2[0] = true;
                g10.setLoading(true);
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                p10Var.a(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new w9(editTextBoldCursor2, w2VarArr2, 1));
                return true;
            }
        });
        t9 t9Var = new t9(zArr, p10Var, editTextBoldCursor, g10, w2VarArr2);
        EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
        g10.setOnClickListener(t9Var);
        if (eVar != null) {
            hi.e eVar2 = eVar;
            t9 t9Var2 = new t9(zArr, p10Var, eVar2, editTextBoldCursor2, w2VarArr2);
            editTextBoldCursor2 = editTextBoldCursor2;
            w2VarArr = w2VarArr2;
            eVar2.setOnClickListener(t9Var2);
        } else {
            w2VarArr = w2VarArr2;
        }
        w2VarArr[0].O();
        w2VarArr[0].setOnDismissListener(new u9(editTextBoldCursor2, 0));
        w2VarArr[0].show();
        org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
        if (Q instanceof bn) {
            z11 = ((bn) Q).sa();
        }
        w9 w9Var = new w9(w2VarArr, editTextBoldCursor2);
        if (z11) {
            j10 = 200;
        } else {
            j10 = 80;
        }
        org.telegram.messenger.g0.h3(w9Var, j10);
    }

    public static org.telegram.ui.ActionBar.w2 l1(final android.content.Context r60, final boolean r61, final long r62, final int r64, final org.telegram.tgnet.tl.TL_stars.StarsTransaction r65, final org.telegram.ui.ActionBar.i6 r66) {
        throw new UnsupportedOperationException("Method not decompiled: di.pb.l1(android.content.Context, boolean, long, int, org.telegram.tgnet.tl.TL_stars$StarsTransaction, org.telegram.ui.ActionBar.i6):org.telegram.ui.ActionBar.w2");
    }

    public static void m1(Activity activity, int i7, int i10, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.i6 i6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = null;
        starsTransaction.description = null;
        starsTransaction.photo = null;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = tL_messageActionPaymentRefunded.peer;
        starsTransaction.date = i10;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPaymentRefunded.total_amount);
        starsTransaction.f28723id = tL_messageActionPaymentRefunded.charge.f28622id;
        starsTransaction.refund = true;
        l1(activity, false, 0L, i7, starsTransaction, i6Var);
    }

    public static void n1(Context context, int i7, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.i6 i6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = mp.u1(i7).B1(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.f28723id = tL_payments_paymentReceiptStars.transaction_id;
        l1(context, false, 0L, i7, starsTransaction, i6Var);
    }

    public static CharSequence t1(CharSequence charSequence, boolean z10) {
        kq[] kqVarArr;
        a5.q c10;
        if (z10 && (charSequence instanceof Spanned)) {
            for (kq kqVar : (kq[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), kq.class)) {
                Drawable drawable = kqVar.f36849c;
                if (drawable != null && !(drawable instanceof a5.q) && (c10 = a5.q.c(org.telegram.messenger.t0.f27013b.getResources(), 2131231962, null)) != null) {
                    c10.setBounds(kqVar.f36849c.getBounds());
                    kqVar.f36849c = c10;
                    kqVar.d = false;
                }
            }
        }
        return charSequence;
    }

    public final void J0() {
        r1();
        ek0 ek0Var = this.f51569c;
        if (ek0Var != null && this.V != null && ek0Var.getLayoutParams() != null) {
            int D = m10.D(48.0f, this.f9529c0, -org.telegram.messenger.g0.L(8.0f));
            int D2 = m10.D(48.0f, this.f9530d0, -org.telegram.messenger.g0.L(8.0f));
            org.telegram.messenger.g0.z3(this.f51569c, 0, D, 0, D2);
            ek0 ek0Var2 = this.f51569c;
            int i7 = -D;
            ek0Var2.setPadding(ek0Var2.getPaddingLeft(), i7, this.f51569c.getPaddingRight(), this.f9530d0 - D2);
            this.V.z(i7, -D2);
        }
    }

    public final void K0(ArrayList arrayList, b51 b51Var) {
        boolean z10;
        ek0 ek0Var;
        int i7;
        o1("FILL_BEFORE");
        st0 st0Var = this.V;
        if (st0Var != null && st0Var.f39707f0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9528b0 = -1;
        if (getParentActivity() == null) {
            return;
        }
        y8 y10 = y8.y(this.currentAccount, false);
        ArrayList arrayList2 = y10.v;
        n41 n41Var = new n41(-2);
        n41Var.f37647c = (tv) super.o0(getParentActivity());
        arrayList.add(n41Var);
        arrayList.add(n41.k(this.f9536j0));
        hi.e eVar = this.f9544s0;
        if (eVar != null) {
            if (getMessagesController().f25695a6) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            eVar.setVisibility(i7);
        }
        arrayList.add(n41.C(null));
        if (getMessagesController().f25776j6) {
            arrayList.add(ki.f.i(-4, getThemedColor(org.telegram.ui.ActionBar.n6.lk), rn.i0(gd.N0(2131743519, null)), gd.N0(2131743520, null)));
            arrayList.add(n41.C(null));
        }
        if (y10.f10049e && !arrayList2.isEmpty()) {
            i5.c.s(2131744962, null, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                int i11 = hb.f8979b;
                n41 K = n41.K(hb.class);
                K.H = (TL_stars.StarsSubscription) arrayList2.get(i10);
                arrayList.add(K);
            }
            if (y10.f10066x) {
                arrayList.add(n41.q(arrayList.size(), 33));
            } else if (!y10.f10067y) {
                n41 c10 = n41.c(-3, 2131230871, gd.N0(2131744961, null));
                c10.f37660r = true;
                arrayList.add(c10);
            }
            arrayList.add(n41.C(null));
        }
        boolean M = y10.M(0);
        this.f9545t0 = M;
        if (M) {
            this.f9528b0 = arrayList.size();
            arrayList.add(n41.n(this.W, -2));
            if (z10 && (ek0Var = this.f51569c) != null) {
                ca.r rVar = this.f9533g0;
                ek0Var.removeCallbacks(rVar);
                this.f51569c.post(rVar);
            }
        } else {
            arrayList.add(n41.m(this.f9534h0));
        }
        o1("FILL_AFTER");
    }

    @Override
    public final View createView(final Context context) {
        boolean z10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i7;
        this.H = false;
        this.F = org.telegram.messenger.g0.L(238.0f);
        st0 st0Var = new st0(context);
        this.V = st0Var;
        boolean z11 = true;
        st0Var.setDebugLoggingEnabled(true);
        this.V.setCommonInsetsManagedExternally(true);
        if (!this.f9531e0) {
            org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
            if (r4Var != null && ((ActionBarLayout) r4Var).T0) {
                i7 = 0;
            } else {
                i7 = org.telegram.messenger.g0.f24220m;
            }
            this.f9529c0 = i7;
            this.f9530d0 = org.telegram.messenger.g0.f24221n;
        }
        this.V.setGeometry(new cb.c(this, 17));
        this.V.z(-m10.D(48.0f, this.f9529c0, -org.telegram.messenger.g0.L(8.0f)), -m10.D(48.0f, this.f9530d0, -org.telegram.messenger.g0.L(8.0f)));
        st0 st0Var2 = this.V;
        st0Var2.getClass();
        this.W = new bi.o3(26, context, st0Var2);
        this.U = new ob(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider(), this.V);
        this.f9534h0 = new bi.o3(1, context, this);
        super.createView(context);
        q00 q00Var = this.f51574s;
        getBaseSimpleGlass().f(q00Var, this.f51569c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.E.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().f56748n = this.V;
        this.f51569c.setCaptureSectionsDecoratorAllowed(true);
        this.U.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().f56749o = new f(1, this, new e(1, q00Var));
        FrameLayout frameLayout = this.U.d;
        View view = new View(getParentActivity());
        this.X = view;
        view.setAlpha(0.0f);
        st0 st0Var3 = this.V;
        st0Var3.addView(this.X, st0Var3.indexOfChild(frameLayout), c8.na.e(-1, 0, 48));
        this.X.setBackground(getBaseSimpleGlass().a(this.X));
        e9 e9Var = new e9(this, 0);
        kr krVar = kr.h;
        te.a aVar = new te.a(0, e9Var, krVar, 380L, false);
        this.Y = aVar;
        this.Z = new te.a(1, new e9(this, 1), krVar, 380L, false);
        this.f9527a0 = new te.a(2, new e9(this, 2), krVar, 380L, false);
        if (!this.f51569c.canScrollVertically(-1) && !this.simpleActionBar.x()) {
            z10 = false;
        } else {
            z10 = true;
        }
        aVar.a(z10, false);
        this.Z.a(this.V.f39707f0, false);
        this.f51569c.j(new bi.v1(this, 10));
        r1();
        fh.g c10 = getBaseSimpleGlass().f56739c.c(frameLayout, null, false);
        c10.p(c8.j0.m(this.resourceProvider));
        c10.q(org.telegram.messenger.g0.L(9.66f));
        c10.r(org.telegram.messenger.g0.L(18.0f));
        frameLayout.setBackground(c10);
        org.telegram.ui.ActionBar.r4 r4Var2 = this.parentLayout;
        if (r4Var2 != null && ((ActionBarLayout) r4Var2).U0) {
            this.simpleActionBar.setBackButtonImage(2131231244);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.S = frameLayout2;
        frameLayout2.setClickable(true);
        vg.m mVar = new vg.m(context, 1, 2);
        this.T = mVar;
        vg.f fVar = mVar.f59590b;
        fVar.f59574z = org.telegram.ui.ActionBar.n6.Wk;
        fVar.A = org.telegram.ui.ActionBar.n6.Xk;
        fVar.b();
        this.T.setStarParticlesView(this.f51570e);
        this.S.addView(this.T, c8.na.d(190, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        j0(gd.N0(2131743970, null), org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(gd.N0(2131743967, null), new bi.h2(context, 1)), true), this.S, null);
        this.f51569c.setOverScrollMode(2);
        v4.l lVar = new v4.l();
        lVar.f59274m = false;
        lVar.C = false;
        lVar.o(krVar);
        lVar.n(350L);
        this.f51569c.setItemAnimator(lVar);
        this.f51569c.setOnItemClickListener(new bi.n8(this, 2));
        tz tzVar = new tz(getParentActivity());
        this.f9535i0 = tzVar;
        this.f51574s.addView(tzVar, c8.na.c(-1.0f, -1));
        y8 y10 = y8.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f9536j0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f9536j0.setPadding(0, org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(getParentActivity(), false, true, false);
        this.f9538l0 = n6Var;
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        this.f9538l0.setTextSize(org.telegram.messenger.g0.L(32.0f));
        this.f9538l0.setGravity(17);
        org.telegram.ui.ActionBar.u6.Y(this.f9538l0, org.telegram.ui.ActionBar.n6.G6, this.resourceProvider);
        this.f9537k0 = new SpannableStringBuilder("S");
        r50 r50Var = new r50(42.0f, this.currentAccount, this.f9538l0);
        nh0 nh0Var = new nh0(2131624218, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f));
        ImageReceiver imageReceiver = r50Var.f51626b;
        imageReceiver.x0(nh0Var);
        imageReceiver.X(2);
        r50Var.f51629f = false;
        r50Var.h = -org.telegram.messenger.g0.L(3.0f);
        this.f9537k0.setSpan(r50Var, 0, 1, 33);
        this.f9536j0.addView(this.f9538l0, c8.na.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.m0 = textView;
        textView.setTextSize(1, 14.0f);
        this.m0.setGravity(17);
        this.m0.setText(gd.N0(2131742519, null));
        org.telegram.ui.ActionBar.u6.U(this.m0, org.telegram.ui.ActionBar.n6.f29862z6, this.resourceProvider);
        this.f9536j0.addView(this.m0, c8.na.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(getParentActivity());
        bi.g3 g3Var = new bi.g3(3, getParentActivity(), this);
        this.f9540o0 = g3Var;
        frameLayout3.addView(g3Var);
        hi.e eVar = new hi.e(getParentActivity(), this.resourceProvider, true);
        this.f9541p0 = eVar;
        eVar.f();
        this.f9541p0.i("", false, true);
        this.f9541p0.setOnClickListener(new View.OnClickListener(this) {
            public final pb f9377b;

            {
                this.f9377b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        pb.A0(this.f9377b, context);
                        return;
                    default:
                        new gb(context, this.f9377b.resourceProvider).show();
                        return;
                }
            }
        });
        this.f9540o0.addView(this.f9541p0, c8.na.e(-1, 48, 119));
        b61 b61Var = new b61(3, getParentActivity(), this);
        this.f9542q0 = b61Var;
        frameLayout3.addView(b61Var);
        hi.e eVar2 = new hi.e(getParentActivity(), this.resourceProvider, true);
        this.f9543r0 = eVar2;
        eVar2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new kq(2131231981, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) gd.N0(2131744724, null));
        this.f9543r0.i(spannableStringBuilder, false, true);
        this.f9543r0.setOnClickListener(new View.OnClickListener(this) {
            public final pb f9377b;

            {
                this.f9377b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        pb.A0(this.f9377b, context);
                        return;
                    default:
                        new gb(context, this.f9377b.resourceProvider).show();
                        return;
                }
            }
        });
        this.f9542q0.addView(this.f9543r0, c8.na.q(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        hi.e eVar3 = new hi.e(getParentActivity(), this.resourceProvider, true);
        this.f9539n0 = eVar3;
        eVar3.f();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new kq(2131231977, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) gd.N0(2131744781, null));
        this.f9539n0.i(spannableStringBuilder2, false, true);
        this.f9539n0.setOnClickListener(new View.OnClickListener(this) {
            public final pb f9927b;

            {
                this.f9927b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        pb pbVar = this.f9927b;
                        pbVar.presentFragment(new t(0, pbVar.getUserConfig().e()));
                        return;
                    default:
                        pb.B0(this.f9927b);
                        return;
                }
            }
        });
        this.f9542q0.addView(this.f9539n0, c8.na.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.f9536j0.addView(frameLayout3, c8.na.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        hi.e eVar4 = new hi.e(getParentActivity(), this.resourceProvider, false);
        this.f9544s0 = eVar4;
        eVar4.f();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new kq(2131231895, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) gd.N0(2131743968, null));
        this.f9544s0.i(spannableStringBuilder3, false, true);
        this.f9544s0.setOnClickListener(new View.OnClickListener(this) {
            public final pb f9927b;

            {
                this.f9927b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        pb pbVar = this.f9927b;
                        pbVar.presentFragment(new t(0, pbVar.getUserConfig().e()));
                        return;
                    default:
                        pb.B0(this.f9927b);
                        return;
                }
            }
        });
        this.f9536j0.addView(this.f9544s0, c8.na.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        p1();
        bi.j8 j8Var = this.f9547v0;
        if (j8Var != null) {
            j8Var.O(false);
        }
        e0.g(this.currentAccount).r(getUserConfig().e());
        TLRPC.TL_payments_starsRevenueStats h = e0.g(this.currentAccount).h(getUserConfig().e(), false);
        if (y10.p().amount <= 0 || h == null || (tL_starsRevenueStatus = h.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) {
            z11 = false;
        }
        q1(z11, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ks.f25320x3;
        int i12 = ks.C3;
        int i13 = ks.B3;
        if (i7 == i13 || i7 == i12 || i7 == i11) {
            o1("NOTIFICATION_" + i7);
        }
        if (i7 == i11) {
            u0();
            bi.j8 j8Var = this.f9547v0;
            if (j8Var != null) {
                j8Var.O(true);
            }
            h0();
        } else if (i7 == i13) {
            y8 y10 = y8.y(this.currentAccount, false);
            if (this.f9545t0 != y10.M(0)) {
                this.f9545t0 = y10.M(0);
                u0();
                bi.j8 j8Var2 = this.f9547v0;
                if (j8Var2 != null) {
                    j8Var2.O(false);
                }
                h0();
            }
        } else if (i7 == i12) {
            bi.j8 j8Var3 = this.f9547v0;
            if (j8Var3 != null) {
                j8Var3.O(true);
            }
        } else if (i7 == ks.A3) {
            p1();
        } else if (i7 == ks.E3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            p1();
        }
    }

    @Override
    public final void h0() {
        st0 st0Var;
        o1("RESTORE_BEFORE");
        super.h0();
        if (this.f9532f0 && (st0Var = this.V) != null && this.f9528b0 != -1) {
            st0Var.a();
        }
        this.f9532f0 = false;
        o1("RESTORE_AFTER");
    }

    @Override
    public final void i0() {
        this.f51574s.addView(this.V, c8.na.c(-1.0f, -1));
        this.V.u(this.f51569c, new e9(this, 3));
        st0 st0Var = this.V;
        ob obVar = this.U;
        st0Var.x(obVar, obVar.f9460b, new ci.v(6));
        this.V.y(this.U.d);
        this.U.d.setLayoutParams(c8.na.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        J0();
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        st0 st0Var = this.V;
        if (st0Var == null || motionEvent == null || st0Var.j(motionEvent.getX(), motionEvent.getY()) || !this.V.c() || this.U.f9460b.f36663b == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final v4.i0 k0() {
        bi.j8 j8Var = new bi.j8(this, this.f51569c, getParentActivity(), this.currentAccount, this.classGuid, new bi.b(this, 18), getResourceProvider(), 1);
        this.f9547v0 = j8Var;
        j8Var.f33631r = false;
        return j8Var;
    }

    @Override
    public final v4.c0 l0(Context context) {
        st0 st0Var = this.V;
        st0Var.getClass();
        return new jg.i0(5, st0Var, false);
    }

    @Override
    public final ug.t1 m0() {
        return new ua(getParentActivity(), 75, 1, 0);
    }

    @Override
    public final View o0(Context context) {
        throw null;
    }

    public final void o1(String str) {
        boolean z10;
        int top;
        int height;
        if (this.V != null) {
            StringBuilder u10 = a8.p0.u("Stars event=", str, " row=");
            u10.append(this.f9528b0);
            u10.append(" hasTransactions=");
            u10.append(this.f9545t0);
            u10.append(" savedPosition=");
            u10.append(this.Q);
            u10.append(" savedOffset=");
            u10.append(this.R);
            u10.append(" savedPinned=");
            u10.append(this.f9532f0);
            u10.append(" boundaryAttached=");
            bi.o3 o3Var = this.W;
            if (o3Var != null && o3Var.getParent() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            u10.append(z10);
            u10.append(" boundaryTop=");
            bi.o3 o3Var2 = this.W;
            if (o3Var2 == null) {
                top = 0;
            } else {
                top = o3Var2.getTop();
            }
            u10.append(top);
            u10.append(" boundaryHeight=");
            bi.o3 o3Var3 = this.W;
            if (o3Var3 == null) {
                height = 0;
            } else {
                height = o3Var3.getHeight();
            }
            u10.append(height);
            Log.d("SiblingScroll", u10.toString());
            st0 st0Var = this.V;
            if (!st0Var.f39697a) {
                return;
            }
            st0Var.f39699b = Math.max(st0Var.f39699b, Math.min(60, Math.max(0, 30)));
            st0Var.f(str, null, 0, 0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        ks.f(this.currentAccount).c(this, ks.f25320x3);
        ks.f(this.currentAccount).c(this, ks.A3);
        ks.f(this.currentAccount).c(this, ks.B3);
        ks.f(this.currentAccount).c(this, ks.C3);
        ks.f(this.currentAccount).c(this, ks.E3);
        y8.y(this.currentAccount, false).R(true);
        y8.y(this.currentAccount, false).Q();
        y8.y(this.currentAccount, false).z();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        ek0 ek0Var = this.f51569c;
        if (ek0Var != null) {
            ek0Var.removeCallbacks(this.f9533g0);
        }
        super.onFragmentDestroy();
        ks.f(this.currentAccount).n(this, ks.f25320x3);
        ks.f(this.currentAccount).n(this, ks.A3);
        ks.f(this.currentAccount).n(this, ks.B3);
        ks.f(this.currentAccount).n(this, ks.C3);
        ks.f(this.currentAccount).n(this, ks.E3);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f9531e0 = true;
        this.f9529c0 = i10;
        this.f9530d0 = i12;
        J0();
    }

    @Override
    public final void onPause() {
        super.onPause();
        vg.m mVar = this.T;
        if (mVar != null) {
            mVar.setPaused(true);
            this.T.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        vg.m mVar = this.T;
        if (mVar != null) {
            mVar.setPaused(false);
            this.T.setDialogVisible(false);
        }
    }

    public final void p1() {
        int i7;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z10 = false;
        y8 y10 = y8.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f9537k0);
        spannableStringBuilder.append((CharSequence) M0(y10.p(), 0.66f, ' '));
        this.f9538l0.setText(spannableStringBuilder);
        hi.e eVar = this.f9541p0;
        if (y10.p().amount > 0) {
            i7 = 2131744909;
        } else {
            i7 = 2131744910;
        }
        eVar.i(gd.N0(i7, null), true, true);
        TLRPC.TL_payments_starsRevenueStats h = e0.g(this.currentAccount).h(getUserConfig().e(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = true;
        }
        q1(z10, true);
    }

    @Override
    public final float q0() {
        ek0 ek0Var = this.f51569c;
        if (ek0Var == null) {
            return 0.0f;
        }
        return ek0Var.getY();
    }

    public final void q1(final boolean z10, boolean z11) {
        float f10;
        int i7;
        float f11;
        this.f9546u0 = z10;
        float f12 = 1.0f;
        int i10 = 0;
        if (z11) {
            this.f9540o0.setVisibility(0);
            this.f9542q0.setVisibility(0);
            ViewPropertyAnimator animate = this.f9540o0.animate();
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            animate.alpha(f11).withEndAction(new Runnable(this) {
                public final pb f8873b;

                {
                    this.f8873b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f8873b.f9540o0.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f8873b.f9542q0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            ViewPropertyAnimator animate2 = this.f9542q0.animate();
            if (!z10) {
                f12 = 0.0f;
            }
            animate2.alpha(f12).withEndAction(new Runnable(this) {
                public final pb f8873b;

                {
                    this.f8873b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f8873b.f9540o0.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f8873b.f9542q0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            return;
        }
        this.f9540o0.animate().cancel();
        this.f9542q0.animate().cancel();
        b61 b61Var = this.f9542q0;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        b61Var.setAlpha(f10);
        bi.g3 g3Var = this.f9540o0;
        if (z10) {
            f12 = 0.0f;
        }
        g3Var.setAlpha(f12);
        b61 b61Var2 = this.f9542q0;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        b61Var2.setVisibility(i7);
        bi.g3 g3Var2 = this.f9540o0;
        if (z10) {
            i10 = 8;
        }
        g3Var2.setVisibility(i10);
    }

    @Override
    public final View r0() {
        return this.V;
    }

    public final void r1() {
        if (this.X == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.f9529c0;
        ViewGroup.LayoutParams layoutParams = this.X.getLayoutParams();
        if (layoutParams.height != L) {
            layoutParams.height = L;
            this.X.setLayoutParams(layoutParams);
        }
        s1();
    }

    @Override
    public final void s0(boolean z10) {
        te.a aVar = this.f9527a0;
        if (aVar != null && aVar.f57780f != z10) {
            aVar.a(z10, true);
        }
    }

    public final void s1() {
        float f10;
        View view = this.X;
        if (view == null) {
            return;
        }
        te.a aVar = this.Y;
        float f11 = 0.0f;
        if (aVar == null) {
            f10 = 0.0f;
        } else {
            f10 = aVar.f57779e;
        }
        te.a aVar2 = this.Z;
        if (aVar2 != null) {
            f11 = aVar2.f57779e;
        }
        view.setTranslationY(((-(1.0f - f10)) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - ((1.0f - f11) * org.telegram.messenger.g0.L(44.0f)));
    }

    @Override
    public final void u0() {
        boolean z10;
        o1("SAVE_BEFORE");
        super.u0();
        st0 st0Var = this.V;
        if (st0Var != null && st0Var.f39707f0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9532f0 = z10;
        ek0 ek0Var = this.f51569c;
        if (ek0Var != null && this.Q >= 0) {
            this.R -= ek0Var.getPaddingTop();
        }
        o1("SAVE_AFTER");
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
