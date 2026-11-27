package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
public final class unb {
    public String a = "";
    public String b = "";
    public String c = "";
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public float k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public znb p;
    public ynb q;
    public float r;
    public ArrayList s;
    public TLRPC.WallPaper t;

    public final void a() {
        a.b.getSharedPreferences("themeconfig", 0).edit().remove(b()).commit();
        gvc.e(this.a).delete();
        gvc.e(this.b).delete();
    }

    public final String b() {
        ynb ynbVar = this.q;
        znb znbVar = this.p;
        if (ynbVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(znbVar.a);
            sb.append("_");
            return uh9.l(sb, this.q.a, "_owp");
        }
        return c00.k(new StringBuilder(), znbVar.a, "_owp");
    }

    public final void c() {
        try {
            String b = b();
            SharedPreferences.Editor edit = a.b.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.a);
            jSONObject.put("owall", this.b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f);
            jSONObject.put("pGrColor3", this.g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.i);
            jSONObject.put("wMotion", this.j);
            jSONObject.put("pIntensity", this.k);
            edit.putString(b, jSONObject.toString());
            edit.commit();
        } catch (Throwable th) {
            cc4.g(th, true);
        }
    }
}
