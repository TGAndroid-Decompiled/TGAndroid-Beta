package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class sd6 extends h44 {
    public final ld6 s0;
    public boolean t0;
    public int u0;
    public int v0;
    public TLRPC.MessageMedia w0;
    public TL_stories.MediaArea x0;

    public sd6(Context context, PointF pointF, int i, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea, float f, int i2) {
        super(context, pointF);
        ld6 ld6Var = new ld6(context, f);
        this.s0 = ld6Var;
        ld6Var.setMaxWidth(i2);
        r(i, messageMedia, mediaArea);
        ld6Var.e(0, this.u0);
        addView(ld6Var, tre.e(-2, -2, 51));
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
        String l = uh9.l(new StringBuilder(""), (int) floor, "°");
        double floor2 = Math.floor((abs - floor) * 60.0d);
        StringBuilder sb = new StringBuilder(l);
        if (floor2 > 0.0d) {
            str = "";
        } else {
            str = "0";
        }
        sb.append(str);
        if (floor2 >= 10.0d) {
            str2 = "";
        } else {
            str2 = "0";
        }
        sb.append(str2);
        String l2 = uh9.l(sb, (int) floor2, "'");
        double floor3 = Math.floor(Math.floor(floor2) * 60.0d);
        StringBuilder sb2 = new StringBuilder(l2);
        if (floor3 > 0.0d) {
            str3 = "";
        } else {
            str3 = "0";
        }
        sb2.append(str3);
        if (floor3 < 10.0d) {
            str4 = "0";
        }
        sb2.append(str4);
        return uh9.l(sb2, (int) floor3, "\"");
    }

    @Override
    public final g44 a() {
        return new r66(this, getContext());
    }

    public int getColor() {
        return this.u0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    @Override
    public a69 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float L = (hl.L(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float L2 = (hl.L(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float e = uh9.e(L, 2.0f, getPositionX(), scaleX);
        return new a69(e, uh9.e(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + e) - e, L2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.s0.K;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.s0.J;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.s0.J;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.s0.K;
    }

    public int getType() {
        return this.v0;
    }

    public int getTypesCount() {
        return this.s0.getTypesCount() - (!this.t0 ? 1 : 0);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        k();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        k();
    }

    public final void r(int i, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        String str;
        String str2;
        String str3;
        this.w0 = messageMedia;
        this.x0 = mediaArea;
        String str4 = null;
        if (messageMedia instanceof TLRPC.TL_messageMediaGeo) {
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            double d = geoPoint.lat;
            double d2 = geoPoint._long;
            StringBuilder sb = new StringBuilder(q(d));
            if (d > 0.0d) {
                str2 = "N";
            } else {
                str2 = "S";
            }
            sb.append(str2);
            sb.append(" ");
            sb.append(q(d2));
            if (d2 > 0.0d) {
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
        ld6 ld6Var = this.s0;
        ld6Var.d(i, str4);
        ld6Var.setText(str);
        m();
    }

    public void setColor(int i) {
        this.t0 = true;
        this.u0 = i;
    }

    public void setMaxWidth(int i) {
        this.s0.setMaxWidth(i);
    }

    public void setType(int i) {
        this.v0 = i;
        this.s0.e(i, this.u0);
    }
}
