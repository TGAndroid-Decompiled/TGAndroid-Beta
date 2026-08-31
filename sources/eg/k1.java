package eg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.tk0;
public final class k1 extends j {
    public final j1 f5315n0;
    public boolean f5316o0;
    public int f5317p0;
    public int f5318q0;
    public TLRPC.MessageMedia f5319r0;
    public TL_stories.MediaArea f5320s0;

    public k1(Context context, PointF pointF, int i10, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea, float f10, int i11) {
        super(context, pointF);
        j1 j1Var = new j1(context, f10);
        this.f5315n0 = j1Var;
        j1Var.setMaxWidth(i11);
        r(i10, messageMedia, mediaArea);
        j1Var.e(0, this.f5317p0);
        addView(j1Var, c6.e(-2, -2, 51));
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
        String m9 = android.support.v4.media.a.m((int) floor, "°", new StringBuilder(""));
        double floor2 = Math.floor((abs - floor) * 60.0d);
        StringBuilder l10 = e2.c.l(m9);
        if (floor2 > 0.0d) {
            str = "";
        } else {
            str = "0";
        }
        l10.append(str);
        if (floor2 >= 10.0d) {
            str2 = "";
        } else {
            str2 = "0";
        }
        l10.append(str2);
        String m10 = android.support.v4.media.a.m((int) floor2, "'", l10);
        double floor3 = Math.floor(Math.floor(floor2) * 60.0d);
        StringBuilder l11 = e2.c.l(m10);
        if (floor3 > 0.0d) {
            str3 = "";
        } else {
            str3 = "0";
        }
        l11.append(str3);
        if (floor3 < 10.0d) {
            str4 = "0";
        }
        l11.append(str4);
        return android.support.v4.media.a.m((int) floor3, "\"", l11);
    }

    @Override
    public final i a() {
        return new f1(this, getContext());
    }

    public int getColor() {
        return this.f5317p0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    @Override
    public tk0 getSelectionBounds() {
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
        return new tk0(c3, org.telegram.ui.b.c(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + c3) - c3, dp2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.f5315n0.G;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f5315n0.F;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f5315n0.F;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f5315n0.G;
    }

    public int getType() {
        return this.f5318q0;
    }

    public int getTypesCount() {
        return this.f5315n0.getTypesCount() - (!this.f5316o0 ? 1 : 0);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
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
        this.f5319r0 = messageMedia;
        this.f5320s0 = mediaArea;
        String str4 = null;
        if (messageMedia instanceof TLRPC.TL_messageMediaGeo) {
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            StringBuilder sb = new StringBuilder();
            sb.append(q(d));
            if (d > 0.0d) {
                str2 = "N";
            } else {
                str2 = "S";
            }
            sb.append(str2);
            sb.append(" ");
            sb.append(q(d10));
            if (d10 > 0.0d) {
                str3 = "E";
            } else {
                str3 = "W";
            }
            sb.append(str3);
            str = sb.toString();
        } else if (messageMedia instanceof TLRPC.TL_messageMediaVenue) {
            String upperCase = messageMedia.title.toUpperCase();
            str4 = ((TLRPC.TL_messageMediaVenue) messageMedia).emoji;
            str = upperCase;
        } else {
            str = "";
        }
        j1 j1Var = this.f5315n0;
        j1Var.d(i10, str4);
        j1Var.setText(str);
        m();
    }

    public void setColor(int i10) {
        this.f5316o0 = true;
        this.f5317p0 = i10;
    }

    public void setMaxWidth(int i10) {
        this.f5315n0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.f5318q0 = i10;
        this.f5315n0.e(i10, this.f5317p0);
    }
}
