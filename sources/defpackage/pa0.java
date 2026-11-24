package defpackage;

import android.os.Build;
public final class pa0 {
    public final boolean a;

    public pa0(boolean z) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str != null) {
            if (str2 != null) {
                this.a = z;
                return;
            } else {
                fvc.f("Null osCodeName");
                throw null;
            }
        }
        fvc.f("Null osRelease");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof pa0) {
                pa0 pa0Var = (pa0) obj;
                String str = Build.VERSION.RELEASE;
                if (str.equals(str)) {
                    String str2 = Build.VERSION.CODENAME;
                    if (str2.equals(str2) && this.a == pa0Var.a) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((Build.VERSION.RELEASE.hashCode() ^ 1000003) * 1000003) ^ Build.VERSION.CODENAME.hashCode()) * 1000003;
        if (this.a) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "OsData{osRelease=" + Build.VERSION.RELEASE + ", osCodeName=" + Build.VERSION.CODENAME + ", isRooted=" + this.a + "}";
    }
}
