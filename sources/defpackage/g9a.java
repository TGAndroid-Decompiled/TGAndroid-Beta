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
public final class g9a extends FrameLayout {
    public boolean a;
    public TextView b;
    public TextView c;
    public TextView d;
    public TextView e;
    public de0 f;
    public de0 h;
    public rb0 n;
    public boolean r;
    public mm s;
    public LinearLayout w;
    public int x;

    public static zm2 a(int i, String str) {
        TLRPC.TL_authorization tL_authorization = new TLRPC.TL_authorization();
        tL_authorization.device_model = str;
        tL_authorization.platform = str;
        tL_authorization.app_name = str;
        return b(i, tL_authorization);
    }

    public static zm2 b(int i, TLRPC.TL_authorization tL_authorization) {
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
            i2 = aob.U7;
            i3 = aob.b8;
            i4 = 2131231047;
        } else if (lowerCase2.contains("edge")) {
            i2 = aob.U7;
            i3 = aob.b8;
            i4 = 2131231043;
        } else if (lowerCase2.contains("chrome")) {
            i2 = aob.U7;
            i3 = aob.b8;
            i4 = 2131231042;
        } else if (lowerCase2.contains("opera")) {
            i2 = aob.U7;
            i3 = aob.b8;
            i4 = 2131231045;
        } else if (lowerCase2.contains("firefox")) {
            i2 = aob.U7;
            i3 = aob.b8;
            i4 = 2131231044;
        } else {
            if (lowerCase2.contains("vivaldi")) {
                i2 = aob.U7;
                i3 = aob.b8;
            } else if (lowerCase.contains("ios")) {
                if (lowerCase2.contains("ipad")) {
                    i6 = 2131231041;
                } else {
                    i6 = 2131231039;
                }
                i4 = i6;
                i2 = aob.T7;
                i3 = aob.a8;
            } else if (lowerCase.contains("windows")) {
                i2 = aob.S7;
                i3 = aob.Z7;
                i4 = 2131231037;
            } else if (lowerCase.contains("macos")) {
                i2 = aob.S7;
                i3 = aob.Z7;
                i4 = 2131231035;
            } else if (lowerCase.contains("android")) {
                if (lowerCase2.contains("tab")) {
                    i5 = 2131231040;
                } else {
                    i5 = 2131231038;
                }
                i4 = i5;
                i2 = aob.R7;
                i3 = aob.Y7;
            } else {
                if (lowerCase.contains("fragment")) {
                    i4 = 2131231212;
                } else if (lowerCase.equalsIgnoreCase("search")) {
                    i2 = aob.T7;
                    i3 = aob.a8;
                    i4 = 2131232359;
                } else if (lowerCase.contains("anonymous")) {
                    i2 = aob.T7;
                    i3 = aob.a8;
                    i4 = 2131231612;
                } else if (lowerCase.contains("premiumbot")) {
                    i2 = aob.pk;
                    i3 = aob.ok;
                    i4 = 2131231174;
                } else if (lowerCase.contains("ads")) {
                    i2 = aob.U7;
                    i3 = aob.b8;
                    i4 = 2131232093;
                } else if (lowerCase.contains("api")) {
                    i2 = aob.R7;
                    i3 = aob.Y7;
                    i4 = 2131231136;
                } else if (lowerCase.equals("?")) {
                    i4 = 2131232129;
                } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                    i2 = aob.S7;
                    i3 = aob.Z7;
                    i4 = 2131231036;
                } else {
                    i2 = aob.U7;
                    i3 = aob.b8;
                }
                i2 = -1;
                i3 = -1;
            }
            i4 = 2131231046;
        }
        Drawable mutate = a.b.getDrawable(i4).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(aob.w0(null, aob.J7, false), PorterDuff.Mode.SRC_IN));
        float f = i;
        int L = hl.L(f);
        int i7 = -16777216;
        if (i2 == -1) {
            w0 = -16777216;
        } else {
            w0 = aob.w0(null, i2, false);
        }
        if (i3 != -1) {
            i7 = aob.w0(null, i3, false);
        }
        y9 y9Var = new y9((byte) 1);
        y9Var.b = L;
        Paint paint = new Paint(1);
        y9Var.c = paint;
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, L, new int[]{w0, i7}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        zm2 zm2Var = new zm2(y9Var, mutate);
        if (lowerCase != null && lowerCase.contains("fragment")) {
            zm2Var.e = (int) ((mutate.getIntrinsicWidth() / 44.0f) * f);
            zm2Var.f = (int) ((mutate.getIntrinsicHeight() / 44.0f) * f);
        }
        return zm2Var;
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
        de0 de0Var = this.h;
        if (de0Var != null) {
            de0Var.setAlpha(f);
        }
        de0 de0Var2 = this.f;
        if (de0Var2 != null) {
            de0Var2.setAlpha(1.0f - f);
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
        rb0 rb0Var = this.n;
        this.r = z;
        de0 de0Var = this.h;
        de0Var.setRoundRadius(hl.L(10.0f));
        if (tLObject instanceof TL_account.TL_connectedBot) {
            TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) tLObject;
            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(tL_connectedBot.bot_id));
            rb0Var.q(X1);
            de0Var.setRoundRadius(hl.L(21.0f));
            de0Var.f(X1, rb0Var);
            textView4.setText(lbc.r(X1));
            textView3.setText(ob6.M0(2131745288, null));
            if (TLObject.hasFlag(tL_connectedBot.flags, 2)) {
                textView2.setText(ob6.a0(null, null, 2131745286, ob6.x(tL_connectedBot.date, false)));
            }
        } else if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            de0Var.setImageDrawable(b(42, tL_authorization));
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
                setTag(Integer.valueOf(aob.I6));
                e1 = ob6.M0(2131747553, null);
            } else {
                setTag(Integer.valueOf(aob.A6));
                e1 = ob6.e1(tL_authorization.date_active);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (tL_authorization.country.length() != 0) {
                spannableStringBuilder.append((CharSequence) tL_authorization.country);
            }
            if (spannableStringBuilder.length() != 0) {
                np3 np3Var = new np3();
                np3Var.b = hl.L(1.5f);
                np3Var.c = 7.0f;
                np3Var.d = 2.0f;
                spannableStringBuilder.append((CharSequence) " . ").setSpan(np3Var, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
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
            TLRPC.User X12 = uc7.s1(i).X1(Long.valueOf(tL_webAuthorization.bot_id));
            textView4.setText(tL_webAuthorization.domain);
            if (X12 != null) {
                rb0Var.q(X12);
                str = lbc.k(X12, true);
                de0Var.f(X12, rb0Var);
            } else {
                str = "";
            }
            int i2 = aob.A6;
            setTag(Integer.valueOf(i2));
            textView.setText(ob6.e1(tL_webAuthorization.date_active));
            yob.X(textView, i2, null);
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
            if (!ob6.a0) {
                f = hl.L(i);
            }
            float f2 = f;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (ob6.a0) {
                i2 = hl.L(i);
            }
            canvas.drawLine(f2, measuredHeight, measuredWidth - i2, getMeasuredHeight() - 1, aob.j0);
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
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(hl.L(f) + (this.r ? 1 : 0), 1073741824));
    }
}
