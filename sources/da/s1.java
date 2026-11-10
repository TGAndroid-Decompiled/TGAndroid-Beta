package da;

import android.os.Build;
public final class s1 {
    public final boolean f8516a;

    public s1(boolean z9) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str != null) {
            if (str2 != null) {
                this.f8516a = z9;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s1) {
                s1 s1Var = (s1) obj;
                String str = Build.VERSION.RELEASE;
                if (str.equals(str)) {
                    String str2 = Build.VERSION.CODENAME;
                    if (str2.equals(str2) && this.f8516a == s1Var.f8516a) {
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
        int i7;
        int hashCode = (((Build.VERSION.RELEASE.hashCode() ^ 1000003) * 1000003) ^ Build.VERSION.CODENAME.hashCode()) * 1000003;
        if (this.f8516a) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode ^ i7;
    }

    public final String toString() {
        return "OsData{osRelease=" + Build.VERSION.RELEASE + ", osCodeName=" + Build.VERSION.CODENAME + ", isRooted=" + this.f8516a + "}";
    }
}
