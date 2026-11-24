package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
public final class ie0 implements eq4 {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    public int i;
    public CharSequence j;
    public int k;
    public CharSequence l;
    public ArrayList m;
    public ArrayList n;
    public boolean o;
    public ArrayList p;
    public final hq4 q;
    public boolean r;
    public int s;

    public ie0(hq4 hq4Var) {
        hq4Var.H();
        fp4 fp4Var = hq4Var.w;
        if (fp4Var != null) {
            fp4Var.b.getClassLoader();
        }
        this.a = new ArrayList();
        this.o = false;
        this.s = -1;
        this.q = hq4Var;
    }

    @Override
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (hq4.K(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.g) {
            this.q.d.add(this);
            return true;
        }
        return true;
    }

    public final void b(xq4 xq4Var) {
        this.a.add(xq4Var);
        xq4Var.d = this.b;
        xq4Var.e = this.c;
        xq4Var.f = this.d;
        xq4Var.g = this.e;
    }

    public final void c(int i) {
        xq4 xq4Var;
        if (this.g) {
            if (hq4.K(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                dp4 dp4Var = ((xq4) arrayList.get(i2)).b;
                if (dp4Var != null) {
                    dp4Var.J += i;
                    if (hq4.K(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + xq4Var.b + " to " + xq4Var.b.J);
                    }
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            xq4 xq4Var = (xq4) arrayList.get(size);
            if (xq4Var.c) {
                if (xq4Var.a == 8) {
                    xq4Var.c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = xq4Var.b.P;
                    xq4Var.a = 2;
                    xq4Var.c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        xq4 xq4Var2 = (xq4) arrayList.get(i2);
                        if (xq4Var2.c && xq4Var2.b.P == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final int e(boolean z, boolean z2) {
        if (!this.r) {
            if (hq4.K(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new ae6());
                g("  ", printWriter, true);
                printWriter.close();
            }
            this.r = true;
            boolean z3 = this.g;
            hq4 hq4Var = this.q;
            if (z3) {
                this.s = hq4Var.k.getAndIncrement();
            } else {
                this.s = -1;
            }
            if (z2) {
                hq4Var.y(this, z);
            }
            return this.s;
        }
        dq9.m("commit already called");
        return 0;
    }

    public final void f(int i, dp4 dp4Var, String str) {
        String str2 = dp4Var.c0;
        if (str2 != null) {
            wq4.c(dp4Var, str2);
        }
        Class<?> cls = dp4Var.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = dp4Var.Q;
                if (str3 != null && !str.equals(str3)) {
                    StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                    sb.append(dp4Var);
                    sb.append(": was ");
                    dq9.m(kt6.p(dp4Var.Q, " now ", str, sb));
                    return;
                }
                dp4Var.Q = str;
            }
            if (i != 0) {
                if (i != -1) {
                    int i2 = dp4Var.O;
                    if (i2 != 0 && i2 != i) {
                        StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                        sb2.append(dp4Var);
                        int i3 = dp4Var.O;
                        sb2.append(": was ");
                        sb2.append(i3);
                        sb2.append(" now ");
                        sb2.append(i);
                        throw new IllegalStateException(sb2.toString());
                    }
                    dp4Var.O = i;
                    dp4Var.P = i;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + dp4Var + " with tag " + str + " to container view with no id");
                }
            }
            b(new xq4(1, dp4Var));
            dp4Var.K = this.q;
            return;
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalStateException("Fragment " + canonicalName + " must be a public static class to be  properly recreated from instance state.");
    }

    public final void g(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.i != 0 || this.j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (this.k != 0 || this.l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.l);
            }
        }
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                xq4 xq4Var = (xq4) arrayList.get(i);
                switch (xq4Var.a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + xq4Var.a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(xq4Var.b);
                if (z) {
                    if (xq4Var.d != 0 || xq4Var.e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(xq4Var.d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(xq4Var.e));
                    }
                    if (xq4Var.f != 0 || xq4Var.g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(xq4Var.f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(xq4Var.g));
                    }
                }
            }
        }
    }

    public final void h(dp4 dp4Var) {
        hq4 hq4Var = dp4Var.K;
        if (hq4Var != null && hq4Var != this.q) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + dp4Var.toString() + " is already attached to a FragmentManager.");
        }
        b(new xq4(3, dp4Var));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
