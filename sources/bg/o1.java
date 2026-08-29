package bg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.hk0;
public final class o1 extends k {
    public final n1 m0;
    public boolean f2430n0;
    public int f2431o0;
    public int f2432p0;
    public TLRPC.MessageMedia f2433q0;
    public TL_stories.MediaArea f2434r0;

    public o1(Context context, PointF pointF, int i10, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea, float f9, int i11) {
        super(context, pointF);
        n1 n1Var = new n1(context, f9);
        this.m0 = n1Var;
        n1Var.setMaxWidth(i11);
        r(i10, messageMedia, mediaArea);
        n1Var.e(0, this.f2431o0);
        addView(n1Var, f6.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    public static String q(double d) {
        String str;
        String str2;
        String str3;
        double abs = Math.abs(d);
        double floor = Math.floor(abs);
        String str4 = "";
        String l10 = a4.w.l((int) floor, "°", new StringBuilder(""));
        double floor2 = Math.floor((abs - floor) * 60.0d);
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n(l10);
        if (floor2 > 0.0d) {
            str = "";
        } else {
            str = "0";
        }
        n10.append(str);
        if (floor2 >= 10.0d) {
            str2 = "";
        } else {
            str2 = "0";
        }
        n10.append(str2);
        String l11 = a4.w.l((int) floor2, "'", n10);
        double floor3 = Math.floor(Math.floor(floor2) * 60.0d);
        StringBuilder n11 = com.google.android.recaptcha.internal.a.n(l11);
        if (floor3 > 0.0d) {
            str3 = "";
        } else {
            str3 = "0";
        }
        n11.append(str3);
        if (floor3 < 10.0d) {
            str4 = "0";
        }
        n11.append(str4);
        return a4.w.l((int) floor3, "\"", n11);
    }

    @Override
    public final j a() {
        return new j1(this, getContext());
    }

    public int getColor() {
        return this.f2431o0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    @Override
    public hk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float c3 = org.telegram.ui.b.c(dp, 2.0f, getPositionX(), scaleX);
        return new hk0(c3, org.telegram.ui.b.c(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + c3) - c3, dp2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.m0.F;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.m0.E;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.m0.E;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.m0.F;
    }

    public int getType() {
        return this.f2432p0;
    }

    public int getTypesCount() {
        return this.m0.getTypesCount() - (!this.f2430n0 ? 1 : 0);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        k();
    }

    public final void r(int i10, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        String str;
        String str2;
        String str3;
        this.f2433q0 = messageMedia;
        this.f2434r0 = mediaArea;
        String str4 = null;
        if (messageMedia instanceof TLRPC.TL_messageMediaGeo) {
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(q(d));
            if (d > 0.0d) {
                str2 = "N";
            } else {
                str2 = "S";
            }
            sb2.append(str2);
            sb2.append(" ");
            sb2.append(q(d10));
            if (d10 > 0.0d) {
                str3 = "E";
            } else {
                str3 = "W";
            }
            sb2.append(str3);
            str = sb2.toString();
        } else if (messageMedia instanceof TLRPC.TL_messageMediaVenue) {
            String upperCase = messageMedia.title.toUpperCase();
            str4 = ((TLRPC.TL_messageMediaVenue) messageMedia).emoji;
            str = upperCase;
        } else {
            str = "";
        }
        n1 n1Var = this.m0;
        n1Var.d(i10, str4);
        n1Var.setText(str);
        m();
    }

    public void setColor(int i10) {
        this.f2430n0 = true;
        this.f2431o0 = i10;
    }

    public void setMaxWidth(int i10) {
        this.m0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.f2432p0 = i10;
        this.m0.e(i10, this.f2431o0);
    }
}
