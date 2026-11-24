package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class q7a extends FrameLayout {
    public boolean a;
    public TextView b;
    public TextView c;
    public TextView d;
    public TextView e;
    public bf0 f;
    public bf0 h;
    public pc0 n;
    public boolean r;
    public ln s;
    public LinearLayout w;
    public int x;

    public static sn2 a(int i, String str) {
        TLRPC.TL_authorization tL_authorization = new TLRPC.TL_authorization();
        tL_authorization.device_model = str;
        tL_authorization.platform = str;
        tL_authorization.app_name = str;
        return b(i, tL_authorization);
    }

    public static sn2 b(int i, TLRPC.TL_authorization tL_authorization) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int w0;
        String lowerCase = tL_authorization.platform.toLowerCase();
        if (lowerCase.isEmpty()) {
            lowerCase = tL_authorization.system_version.toLowerCase();
        }
        String lowerCase2 = tL_authorization.device_model.toLowerCase();
        if (lowerCase2.contains("safari")) {
            i2 = cmb.T7;
            i3 = cmb.a8;
            i4 = 2131231048;
        } else if (lowerCase2.contains("edge")) {
            i2 = cmb.T7;
            i3 = cmb.a8;
            i4 = 2131231044;
        } else if (lowerCase2.contains("chrome")) {
            i2 = cmb.T7;
            i3 = cmb.a8;
            i4 = 2131231043;
        } else if (lowerCase2.contains("opera")) {
            i2 = cmb.T7;
            i3 = cmb.a8;
            i4 = 2131231046;
        } else if (lowerCase2.contains("firefox")) {
            i2 = cmb.T7;
            i3 = cmb.a8;
            i4 = 2131231045;
        } else {
            if (lowerCase2.contains("vivaldi")) {
                i2 = cmb.T7;
                i3 = cmb.a8;
            } else if (lowerCase.contains("ios")) {
                if (lowerCase2.contains("ipad")) {
                    i6 = 2131231042;
                } else {
                    i6 = 2131231040;
                }
                i4 = i6;
                i2 = cmb.S7;
                i3 = cmb.Z7;
            } else if (lowerCase.contains("windows")) {
                i2 = cmb.R7;
                i3 = cmb.Y7;
                i4 = 2131231038;
            } else if (lowerCase.contains("macos")) {
                i2 = cmb.R7;
                i3 = cmb.Y7;
                i4 = 2131231036;
            } else if (lowerCase.contains("android")) {
                if (lowerCase2.contains("tab")) {
                    i5 = 2131231041;
                } else {
                    i5 = 2131231039;
                }
                i4 = i5;
                i2 = cmb.Q7;
                i3 = cmb.X7;
            } else {
                if (lowerCase.contains("fragment")) {
                    i4 = 2131231213;
                } else if (lowerCase.equalsIgnoreCase("search")) {
                    i2 = cmb.S7;
                    i3 = cmb.Z7;
                    i4 = 2131232360;
                } else if (lowerCase.contains("anonymous")) {
                    i2 = cmb.S7;
                    i3 = cmb.Z7;
                    i4 = 2131231613;
                } else if (lowerCase.contains("premiumbot")) {
                    i2 = cmb.ok;
                    i3 = cmb.nk;
                    i4 = 2131231175;
                } else if (lowerCase.contains("ads")) {
                    i2 = cmb.T7;
                    i3 = cmb.a8;
                    i4 = 2131232094;
                } else if (lowerCase.contains("api")) {
                    i2 = cmb.Q7;
                    i3 = cmb.X7;
                    i4 = 2131231137;
                } else if (lowerCase.equals("?")) {
                    i4 = 2131232130;
                } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                    i2 = cmb.R7;
                    i3 = cmb.Y7;
                    i4 = 2131231037;
                } else {
                    i2 = cmb.T7;
                    i3 = cmb.a8;
                }
                i2 = -1;
                i3 = -1;
            }
            i4 = 2131231047;
        }
        Drawable mutate = a.b.getDrawable(i4).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(cmb.w0(null, cmb.I7, false), PorterDuff.Mode.SRC_IN));
        float f = i;
        int L = gm.L(f);
        int i7 = -16777216;
        if (i2 == -1) {
            w0 = -16777216;
        } else {
            w0 = cmb.w0(null, i2, false);
        }
        if (i3 != -1) {
            i7 = cmb.w0(null, i3, false);
        }
        x9 x9Var = new x9((byte) 1);
        x9Var.b = L;
        Paint paint = new Paint(1);
        x9Var.c = paint;
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, L, new int[]{w0, i7}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        sn2 sn2Var = new sn2(x9Var, mutate);
        if (lowerCase != null && lowerCase.contains("fragment")) {
            sn2Var.e = (int) ((mutate.getIntrinsicWidth() / 44.0f) * f);
            sn2Var.f = (int) ((mutate.getIntrinsicHeight() / 44.0f) * f);
        }
        return sn2Var;
    }

    private void setContentAlpha(float f) {
        TextView textView = this.e;
        if (textView != null) {
            textView.setAlpha(f);
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setAlpha(f);
        }
        TextView textView3 = this.b;
        if (textView3 != null) {
            textView3.setAlpha(f);
        }
        TextView textView4 = this.c;
        if (textView4 != null) {
            textView4.setAlpha(f);
        }
        bf0 bf0Var = this.h;
        if (bf0Var != null) {
            bf0Var.setAlpha(f);
        }
        bf0 bf0Var2 = this.f;
        if (bf0Var2 != null) {
            bf0Var2.setAlpha(1.0f - f);
        }
        LinearLayout linearLayout = this.w;
        if (linearLayout != null) {
            linearLayout.setAlpha(f);
        }
    }

    public final void c(TLObject tLObject, boolean z) {
        String str;
        String e1;
        TextView textView = this.c;
        TextView textView2 = this.e;
        TextView textView3 = this.d;
        TextView textView4 = this.b;
        int i = this.x;
        pc0 pc0Var = this.n;
        this.r = z;
        bf0 bf0Var = this.h;
        bf0Var.setRoundRadius(gm.L(10.0f));
        if (tLObject instanceof TL_account.TL_connectedBot) {
            TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) tLObject;
            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(tL_connectedBot.bot_id));
            pc0Var.q(W1);
            bf0Var.setRoundRadius(gm.L(21.0f));
            bf0Var.f(W1, pc0Var);
            textView4.setText(m9c.r(W1));
            textView3.setText(jb6.M0(2131745294, null));
            if (TLObject.hasFlag(tL_connectedBot.flags, 2)) {
                textView2.setText(jb6.a0(null, null, 2131745292, jb6.x(tL_connectedBot.date, false)));
            }
        } else if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            bf0Var.setImageDrawable(b(42, tL_authorization));
            StringBuilder sb = new StringBuilder();
            if (tL_authorization.device_model.length() != 0) {
                sb.append(tL_authorization.device_model);
            }
            if (sb.length() == 0) {
                if (tL_authorization.platform.length() != 0) {
                    sb.append(tL_authorization.platform);
                }
                if (tL_authorization.system_version.length() != 0) {
                    if (tL_authorization.platform.length() != 0) {
                        sb.append(" ");
                    }
                    sb.append(tL_authorization.system_version);
                }
            }
            textView4.setText(sb);
            if ((tL_authorization.flags & 1) != 0) {
                setTag(Integer.valueOf(cmb.H6));
                e1 = jb6.M0(2131747559, null);
            } else {
                setTag(Integer.valueOf(cmb.z6));
                e1 = jb6.e1(tL_authorization.date_active);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (tL_authorization.country.length() != 0) {
                spannableStringBuilder.append((CharSequence) tL_authorization.country);
            }
            if (spannableStringBuilder.length() != 0) {
                gq3 gq3Var = new gq3();
                gq3Var.b = gm.L(1.5f);
                gq3Var.c = 7.0f;
                gq3Var.d = 2.0f;
                spannableStringBuilder.append((CharSequence) " . ").setSpan(gq3Var, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
            }
            spannableStringBuilder.append((CharSequence) e1);
            textView2.setText(spannableStringBuilder);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_authorization.app_name);
            sb2.append(" ");
            sb2.append(tL_authorization.app_version);
            textView3.setText(sb2);
        } else if (tLObject instanceof TLRPC.TL_webAuthorization) {
            TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) tLObject;
            TLRPC.User W12 = oc7.r1(i).W1(Long.valueOf(tL_webAuthorization.bot_id));
            textView4.setText(tL_webAuthorization.domain);
            if (W12 != null) {
                pc0Var.q(W12);
                str = m9c.k(W12, true);
                bf0Var.f(W12, pc0Var);
            } else {
                str = "";
            }
            int i2 = cmb.z6;
            setTag(Integer.valueOf(i2));
            textView.setText(jb6.e1(tL_webAuthorization.date_active));
            anb.X(textView, i2, null);
            StringBuilder sb3 = new StringBuilder();
            if (tL_webAuthorization.ip.length() != 0) {
                sb3.append(tL_webAuthorization.ip);
            }
            if (tL_webAuthorization.region.length() != 0) {
                if (sb3.length() != 0) {
                    sb3.append(" ");
                }
                sb3.append("— ");
                sb3.append(tL_webAuthorization.region);
            }
            textView2.setText(sb3);
            StringBuilder sb4 = new StringBuilder();
            if (!TextUtils.isEmpty(str)) {
                sb4.append(str);
            }
            if (tL_webAuthorization.browser.length() != 0) {
                if (sb4.length() != 0) {
                    sb4.append(", ");
                }
                sb4.append(tL_webAuthorization.browser);
            }
            if (tL_webAuthorization.platform.length() != 0) {
                if (sb4.length() != 0) {
                    sb4.append(", ");
                }
                sb4.append(tL_webAuthorization.platform);
            }
            textView3.setText(sb4);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        int i2 = 0;
        float f = 0.0f;
        setContentAlpha(1.0f - this.s.e(false, 0.0f));
        if (this.r) {
            if (this.a) {
                i = 49;
            } else {
                i = 72;
            }
            if (!jb6.a0) {
                f = gm.L(i);
            }
            float f2 = f;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (jb6.a0) {
                i2 = gm.L(i);
            }
            canvas.drawLine(f2, measuredHeight, measuredWidth - i2, getMeasuredHeight() - 1, cmb.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        if (!this.a) {
            f = 70.0f;
        } else {
            f = 90.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(gm.L(f) + (this.r ? 1 : 0), 1073741824));
    }
}
