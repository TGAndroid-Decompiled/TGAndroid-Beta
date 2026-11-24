package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
public abstract class bn4 implements ComponentCallbacks, View.OnCreateContextMenuListener, e16, tdc, oc5, dq9 {
    public static final Object k0 = new Object();
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public go4 K;
    public dn4 L;
    public bn4 N;
    public int O;
    public int P;
    public String Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean V;
    public ViewGroup W;
    public boolean X;
    public an4 Z;
    public boolean a0;
    public Bundle b;
    public boolean b0;
    public SparseArray c;
    public String c0;
    public Bundle d;
    public v06 d0;
    public g16 e0;
    public Bundle f;
    public final hh7 f0;
    public eq9 g0;
    public bn4 h;
    public qx h0;
    public final ArrayList i0;
    public final ym4 j0;
    public int r;
    public boolean w;
    public boolean x;
    public boolean y;
    public int a = -1;
    public String e = UUID.randomUUID().toString();
    public String n = null;
    public Boolean s = null;
    public ho4 M = new go4();
    public final boolean U = true;
    public boolean Y = true;

    public bn4() {
        new ez3(this, (byte) 6);
        this.d0 = v06.e;
        this.f0 = new hh7();
        this.i0 = new ArrayList();
        this.j0 = new ym4(this);
        r();
    }

    public void A() {
        this.V = true;
    }

    public void B() {
        this.V = true;
    }

    public void C() {
        this.V = true;
    }

    public LayoutInflater D(Bundle bundle) {
        dn4 dn4Var = this.L;
        if (dn4Var != null) {
            en4 en4Var = dn4Var.e;
            LayoutInflater cloneInContext = en4Var.getLayoutInflater().cloneInContext(en4Var);
            cloneInContext.setFactory2(this.M.f);
            return cloneInContext;
        }
        sc8.j("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        return null;
    }

    public void E() {
        this.V = true;
    }

    public void F() {
        this.V = true;
    }

    public abstract void H();

    public abstract void I();

    public void J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.M.R();
        this.I = true;
        f();
    }

    public final Context K() {
        Context n = n();
        if (n != null) {
            return n;
        }
        w44.d(this, " not attached to a context.", "Fragment ");
        return null;
    }

    public final void L() {
        Bundle bundle;
        Bundle bundle2 = this.b;
        if (bundle2 != null && (bundle = bundle2.getBundle("childFragmentManager")) != null) {
            this.M.X(bundle);
            ho4 ho4Var = this.M;
            ho4Var.H = false;
            ho4Var.I = false;
            ho4Var.O.g = false;
            ho4Var.u(1);
        }
    }

    public final void M(int i, int i2, int i3, int i4) {
        if (this.Z == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        j().b = i;
        j().c = i2;
        j().d = i3;
        j().e = i4;
    }

    public final void N(Bundle bundle) {
        boolean P;
        go4 go4Var = this.K;
        if (go4Var != null) {
            if (go4Var == null) {
                P = false;
            } else {
                P = go4Var.P();
            }
            if (P) {
                sc8.j("Fragment already added and state has been saved");
                return;
            }
        }
        this.f = bundle;
    }

    @Override
    public final rdc c() {
        Application application = null;
        if (this.K != null) {
            eq9 eq9Var = this.g0;
            if (eq9Var == null) {
                Context applicationContext = K().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        break;
                    } else if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    } else {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                }
                if (application == null && go4.K(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + K().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                eq9 eq9Var2 = new eq9(application, this, this.f);
                this.g0 = eq9Var2;
                return eq9Var2;
            }
            return eq9Var;
        }
        sc8.j("Can't access ViewModels from detached fragment");
        return null;
    }

    @Override
    public final fh7 d() {
        Application application;
        Context applicationContext = K().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        if (application == null && go4.K(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + K().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        fh7 fh7Var = new fh7();
        LinkedHashMap linkedHashMap = (LinkedHashMap) fh7Var.a;
        if (application != null) {
            linkedHashMap.put(qdc.I, application);
        }
        linkedHashMap.put(mcd.a, this);
        linkedHashMap.put(mcd.b, this);
        Bundle bundle = this.f;
        if (bundle != null) {
            linkedHashMap.put(mcd.c, bundle);
        }
        return fh7Var;
    }

    public final Activity e() {
        return k();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return false;
        }
        return true;
    }

    @Override
    public final sdc f() {
        if (this.K != null) {
            if (o() != 1) {
                HashMap hashMap = this.K.O.d;
                sdc sdcVar = (sdc) hashMap.get(this.e);
                if (sdcVar == null) {
                    sdc sdcVar2 = new sdc();
                    hashMap.put(this.e, sdcVar2);
                    return sdcVar2;
                }
                return sdcVar;
            }
            sc8.j("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        sc8.j("Can't access ViewModels from detached fragment");
        return null;
    }

    @Override
    public final oo g() {
        return (oo) this.h0.d;
    }

    public iie h() {
        return new ye3(this);
    }

    public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.O));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.P));
        printWriter.print(" mTag=");
        printWriter.println(this.Q);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.a);
        printWriter.print(" mWho=");
        printWriter.print(this.e);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.J);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.w);
        printWriter.print(" mRemoving=");
        printWriter.print(this.x);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.E);
        printWriter.print(" mInLayout=");
        printWriter.println(this.F);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.R);
        printWriter.print(" mDetached=");
        printWriter.print(this.S);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.U);
        printWriter.print(" mHasMenu=");
        int i8 = 0;
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.T);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.Y);
        if (this.K != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.K);
        }
        if (this.L != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.L);
        }
        if (this.N != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.N);
        }
        if (this.f != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f);
        }
        if (this.b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.b);
        }
        if (this.c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.c);
        }
        if (this.d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.d);
        }
        bn4 bn4Var = this.h;
        if (bn4Var == null) {
            go4 go4Var = this.K;
            if (go4Var != null && (str2 = this.n) != null) {
                bn4Var = go4Var.c.m(str2);
            } else {
                bn4Var = null;
            }
        }
        if (bn4Var != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(bn4Var);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.r);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        an4 an4Var = this.Z;
        if (an4Var == null) {
            z = false;
        } else {
            z = an4Var.a;
        }
        printWriter.println(z);
        an4 an4Var2 = this.Z;
        if (an4Var2 == null) {
            i = 0;
        } else {
            i = an4Var2.b;
        }
        if (i != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            an4 an4Var3 = this.Z;
            if (an4Var3 == null) {
                i7 = 0;
            } else {
                i7 = an4Var3.b;
            }
            printWriter.println(i7);
        }
        an4 an4Var4 = this.Z;
        if (an4Var4 == null) {
            i2 = 0;
        } else {
            i2 = an4Var4.c;
        }
        if (i2 != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            an4 an4Var5 = this.Z;
            if (an4Var5 == null) {
                i6 = 0;
            } else {
                i6 = an4Var5.c;
            }
            printWriter.println(i6);
        }
        an4 an4Var6 = this.Z;
        if (an4Var6 == null) {
            i3 = 0;
        } else {
            i3 = an4Var6.d;
        }
        if (i3 != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            an4 an4Var7 = this.Z;
            if (an4Var7 == null) {
                i5 = 0;
            } else {
                i5 = an4Var7.d;
            }
            printWriter.println(i5);
        }
        an4 an4Var8 = this.Z;
        if (an4Var8 == null) {
            i4 = 0;
        } else {
            i4 = an4Var8.e;
        }
        if (i4 != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            an4 an4Var9 = this.Z;
            if (an4Var9 != null) {
                i8 = an4Var9.e;
            }
            printWriter.println(i8);
        }
        if (this.W != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.W);
        }
        if (n() != null) {
            new sk4(this, f()).n(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.M + ":");
        this.M.w(str.concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final an4 j() {
        an4 an4Var = this.Z;
        if (an4Var == null) {
            ?? obj = new Object();
            Object obj2 = k0;
            obj.f = obj2;
            obj.g = obj2;
            obj.h = obj2;
            obj.i = null;
            this.Z = obj;
            return obj;
        }
        return an4Var;
    }

    public final en4 k() {
        dn4 dn4Var = this.L;
        if (dn4Var == null) {
            return null;
        }
        return (en4) dn4Var.a;
    }

    public final go4 l() {
        if (this.L != null) {
            return this.M;
        }
        w44.d(this, " has not been attached yet.", "Fragment ");
        return null;
    }

    @Override
    public final g16 m() {
        return this.e0;
    }

    public final Context n() {
        dn4 dn4Var = this.L;
        if (dn4Var == null) {
            return null;
        }
        return dn4Var.b;
    }

    public final int o() {
        v06 v06Var = this.d0;
        if (v06Var != v06.b && this.N != null) {
            return Math.min(v06Var.ordinal(), this.N.o());
        }
        return v06Var.ordinal();
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        this.V = true;
    }

    @Override
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        en4 k = k();
        if (k != null) {
            k.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        } else {
            w44.d(this, " not attached to an activity.", "Fragment ");
        }
    }

    @Override
    public final void onLowMemory() {
        this.V = true;
    }

    public final go4 p() {
        go4 go4Var = this.K;
        if (go4Var != null) {
            return go4Var;
        }
        w44.d(this, " not associated with a fragment manager.", "Fragment ");
        return null;
    }

    public final String q(int i) {
        return K().getResources().getString(i);
    }

    public final void r() {
        this.e0 = new g16(this);
        this.h0 = new qx(this);
        this.g0 = null;
        ArrayList arrayList = this.i0;
        ym4 ym4Var = this.j0;
        if (!arrayList.contains(ym4Var)) {
            if (this.a >= 0) {
                ym4Var.a();
            } else {
                arrayList.add(ym4Var);
            }
        }
    }

    public final void s() {
        r();
        this.c0 = this.e;
        this.e = UUID.randomUUID().toString();
        this.w = false;
        this.x = false;
        this.E = false;
        this.F = false;
        this.H = false;
        this.J = 0;
        this.K = null;
        this.M = new go4();
        this.L = null;
        this.O = 0;
        this.P = 0;
        this.Q = null;
        this.R = false;
        this.S = false;
    }

    public final void startActivityForResult(Intent intent, int i) {
        if (this.L != null) {
            go4 p = p();
            if (p.C != null) {
                String str = this.e;
                ?? obj = new Object();
                obj.a = str;
                obj.b = i;
                p.F.addLast(obj);
                p.C.a(intent);
                return;
            }
            dn4 dn4Var = p.w;
            dn4Var.getClass();
            intent.getClass();
            if (i == -1) {
                dn4Var.b.startActivity(intent, null);
                return;
            } else {
                sc8.j("Starting activity with a requestCode requires a FragmentActivity host");
                return;
            }
        }
        w44.d(this, " not attached to Activity", "Fragment ");
    }

    public final boolean t() {
        if (this.L != null && this.w) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.e);
        if (this.O != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.O));
        }
        if (this.Q != null) {
            sb.append(" tag=");
            sb.append(this.Q);
        }
        sb.append(")");
        return sb.toString();
    }

    public final boolean u() {
        boolean u;
        if (!this.R) {
            if (this.K != null) {
                bn4 bn4Var = this.N;
                if (bn4Var == null) {
                    u = false;
                } else {
                    u = bn4Var.u();
                }
                if (u) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean v() {
        if (this.J > 0) {
            return true;
        }
        return false;
    }

    public void w() {
        this.V = true;
    }

    public void x(int i, int i2, Intent intent) {
        if (go4.K(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void y(Context context) {
        Activity activity;
        this.V = true;
        dn4 dn4Var = this.L;
        if (dn4Var == null) {
            activity = null;
        } else {
            activity = dn4Var.a;
        }
        if (activity != null) {
            this.V = true;
        }
    }

    public void z(Bundle bundle) {
        this.V = true;
        L();
        ho4 ho4Var = this.M;
        if (ho4Var.v >= 1) {
            return;
        }
        ho4Var.H = false;
        ho4Var.I = false;
        ho4Var.O.g = false;
        ho4Var.u(1);
    }

    public void G(Bundle bundle) {
    }
}
