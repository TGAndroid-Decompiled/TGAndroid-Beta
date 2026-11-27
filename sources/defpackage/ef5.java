package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
public abstract class ef5 extends l9c {
    public final int Q;
    public final ArrayList R;
    public boolean S;
    public p5b T;
    public boolean U;
    public boolean V;
    public int W;
    public int X;
    public boolean Y;
    public int Z;
    public String a0;
    public String b0;
    public int c0;
    public l65 d0;
    public final boolean[] e0;

    public ef5(d79 d79Var, Activity activity, int i) {
        super(d79Var, activity, i, 0, false, null, null);
        this.R = new ArrayList();
        this.W = 0;
        this.X = -1;
        this.e0 = new boolean[1];
        this.w = new yt4(this, (byte) 11);
        this.Q = i;
    }

    public static String Y(String str, boolean[] zArr) {
        boolean z;
        if (zArr != null) {
            zArr[0] = false;
        }
        if (str != null && !str.isEmpty()) {
            String trim = str.trim();
            if (trim.length() > 1) {
                if ((trim.charAt(0) == '#' || trim.charAt(0) == '$') && trim.indexOf(64) < 0) {
                    if (zArr != null) {
                        if (trim.charAt(0) == '$') {
                            z = true;
                        } else {
                            z = false;
                        }
                        zArr[0] = z;
                    }
                    return trim.substring(1);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void W() {
        p5b p5bVar = this.T;
        if (p5bVar != null && p5bVar.I != 0) {
            ConnectionsManager.getInstance(p5bVar.c).cancelRequest(p5bVar.I, true);
            p5bVar.I = 0;
        }
        this.S = false;
        if (this.X >= 0) {
            ConnectionsManager.getInstance(this.Q).cancelRequest(this.X, true);
            this.X = -1;
        }
        hl.r(this.d0);
        this.W++;
        this.V = false;
    }

    public final void X() {
        d79 d79Var;
        if (!TextUtils.isEmpty(this.a0) && !this.Y && !this.V && (d79Var = this.d) != null) {
            for (int i = 0; i < d79Var.getChildCount(); i++) {
                if (d79Var.getChildAt(i) instanceof tk4) {
                    Z(this.a0);
                    return;
                }
            }
        }
    }

    public final void Z(String str) {
        this.a0 = str;
        String Y = Y(str, this.e0);
        if (!TextUtils.equals(this.b0, Y)) {
            this.R.clear();
            this.Y = false;
            this.Z = 0;
            W();
        } else if (this.V) {
            return;
        }
        int i = this.W + 1;
        this.W = i;
        if (Y == null) {
            return;
        }
        this.V = true;
        O(true);
        l65 l65Var = new l65(this, i, Y, (byte) 2);
        this.d0 = l65Var;
        hl.d3(l65Var, 300L);
    }
}
