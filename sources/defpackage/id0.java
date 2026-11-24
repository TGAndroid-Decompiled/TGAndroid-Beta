package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
public final class id0 implements do4 {
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
    public final go4 q;
    public boolean r;
    public int s;

    public id0(go4 go4Var) {
        go4Var.H();
        dn4 dn4Var = go4Var.w;
        if (dn4Var != null) {
            dn4Var.b.getClassLoader();
        }
        this.a = new ArrayList();
        this.o = false;
        this.s = -1;
        this.q = go4Var;
    }

    @Override
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (go4.K(2)) {
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

    public final void b(wo4 wo4Var) {
        this.a.add(wo4Var);
        wo4Var.d = this.b;
        wo4Var.e = this.c;
        wo4Var.f = this.d;
        wo4Var.g = this.e;
    }

    public final void c(int i) {
        wo4 wo4Var;
        if (this.g) {
            if (go4.K(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                bn4 bn4Var = ((wo4) arrayList.get(i2)).b;
                if (bn4Var != null) {
                    bn4Var.J += i;
                    if (go4.K(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + wo4Var.b + " to " + wo4Var.b.J);
                    }
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            wo4 wo4Var = (wo4) arrayList.get(size);
            if (wo4Var.c) {
                if (wo4Var.a == 8) {
                    wo4Var.c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = wo4Var.b.P;
                    wo4Var.a = 2;
                    wo4Var.c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        wo4 wo4Var2 = (wo4) arrayList.get(i2);
                        if (wo4Var2.c && wo4Var2.b.P == i) {
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
            if (go4.K(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new bc6());
                g("  ", printWriter, true);
                printWriter.close();
            }
            this.r = true;
            boolean z3 = this.g;
            go4 go4Var = this.q;
            if (z3) {
                this.s = go4Var.k.getAndIncrement();
            } else {
                this.s = -1;
            }
            if (z2) {
                go4Var.y(this, z);
            }
            return this.s;
        }
        sc8.j("commit already called");
        return 0;
    }

    public final void f(int i, bn4 bn4Var, String str) {
        String str2 = bn4Var.c0;
        if (str2 != null) {
            vo4.c(bn4Var, str2);
        }
        Class<?> cls = bn4Var.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = bn4Var.Q;
                if (str3 != null && !str.equals(str3)) {
                    StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                    sb.append(bn4Var);
                    sb.append(": was ");
                    sc8.j(ls6.o(bn4Var.Q, " now ", str, sb));
                    return;
                }
                bn4Var.Q = str;
            }
            if (i != 0) {
                if (i != -1) {
                    int i2 = bn4Var.O;
                    if (i2 != 0 && i2 != i) {
                        StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                        sb2.append(bn4Var);
                        int i3 = bn4Var.O;
                        sb2.append(": was ");
                        sb2.append(i3);
                        sb2.append(" now ");
                        sb2.append(i);
                        throw new IllegalStateException(sb2.toString());
                    }
                    bn4Var.O = i;
                    bn4Var.P = i;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + bn4Var + " with tag " + str + " to container view with no id");
                }
            }
            b(new wo4(1, bn4Var));
            bn4Var.K = this.q;
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
                wo4 wo4Var = (wo4) arrayList.get(i);
                switch (wo4Var.a) {
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
                        str2 = "cmd=" + wo4Var.a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(wo4Var.b);
                if (z) {
                    if (wo4Var.d != 0 || wo4Var.e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(wo4Var.d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(wo4Var.e));
                    }
                    if (wo4Var.f != 0 || wo4Var.g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(wo4Var.f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(wo4Var.g));
                    }
                }
            }
        }
    }

    public final void h(bn4 bn4Var) {
        go4 go4Var = bn4Var.K;
        if (go4Var != null && go4Var != this.q) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + bn4Var.toString() + " is already attached to a FragmentManager.");
        }
        b(new wo4(3, bn4Var));
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
