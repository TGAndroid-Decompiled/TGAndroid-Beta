package ca;

import android.os.Build;
public final class s1 {
    public final boolean f4539a;

    public s1(boolean z10) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str != null) {
            if (str2 != null) {
                this.f4539a = z10;
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
                    if (str2.equals(str2) && this.f4539a == s1Var.f4539a) {
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
        int i3;
        int hashCode = (((Build.VERSION.RELEASE.hashCode() ^ 1000003) * 1000003) ^ Build.VERSION.CODENAME.hashCode()) * 1000003;
        if (this.f4539a) {
            i3 = 1231;
        } else {
            i3 = 1237;
        }
        return hashCode ^ i3;
    }

    public final String toString() {
        return "OsData{osRelease=" + Build.VERSION.RELEASE + ", osCodeName=" + Build.VERSION.CODENAME + ", isRooted=" + this.f4539a + "}";
    }
}
