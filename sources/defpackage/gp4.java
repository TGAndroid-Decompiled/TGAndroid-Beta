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
public abstract class gp4 implements ComponentCallbacks, View.OnCreateContextMenuListener, i36, shc, pe5, vt9 {
    public static final Object k0 = new Object();
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public kq4 K;
    public ip4 L;
    public gp4 N;
    public int O;
    public int P;
    public String Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean V;
    public ViewGroup W;
    public boolean X;
    public fp4 Z;
    public boolean a0;
    public Bundle b;
    public boolean b0;
    public SparseArray c;
    public String c0;
    public Bundle d;
    public z26 d0;
    public k36 e0;
    public Bundle f;
    public final qj7 f0;
    public wt9 g0;
    public gp4 h;
    public rx h0;
    public final ArrayList i0;
    public final dp4 j0;
    public int r;
    public boolean w;
    public boolean x;
    public boolean y;
    public int a = -1;
    public String e = UUID.randomUUID().toString();
    public String n = null;
    public Boolean s = null;
    public lq4 M = new kq4();
    public final boolean U = true;
    public boolean Y = true;

    public gp4() {
        new zz3(this, (byte) 6);
        this.d0 = z26.e;
        this.f0 = new qj7();
        this.i0 = new ArrayList();
        this.j0 = new dp4(this);
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
        ip4 ip4Var = this.L;
        if (ip4Var != null) {
            jp4 jp4Var = ip4Var.e;
            LayoutInflater cloneInContext = jp4Var.getLayoutInflater().cloneInContext(jp4Var);
            cloneInContext.setFactory2(this.M.f);
            return cloneInContext;
        }
        grb.i("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
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
        xi4.j(this, " not attached to a context.", "Fragment ");
        return null;
    }

    public final void L() {
        Bundle bundle;
        Bundle bundle2 = this.b;
        if (bundle2 != null && (bundle = bundle2.getBundle("childFragmentManager")) != null) {
            this.M.X(bundle);
            lq4 lq4Var = this.M;
            lq4Var.H = false;
            lq4Var.I = false;
            lq4Var.O.g = false;
            lq4Var.u(1);
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
        kq4 kq4Var = this.K;
        if (kq4Var != null) {
            if (kq4Var == null) {
                P = false;
            } else {
                P = kq4Var.P();
            }
            if (P) {
                grb.i("Fragment already added and state has been saved");
                return;
            }
        }
        this.f = bundle;
    }

    @Override
    public final qhc c() {
        Application application = null;
        if (this.K != null) {
            wt9 wt9Var = this.g0;
            if (wt9Var == null) {
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
                if (application == null && kq4.K(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + K().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                wt9 wt9Var2 = new wt9(application, this, this.f);
                this.g0 = wt9Var2;
                return wt9Var2;
            }
            return wt9Var;
        }
        grb.i("Can't access ViewModels from detached fragment");
        return null;
    }

    @Override
    public final oj7 d() {
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
        if (application == null && kq4.K(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + K().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        oj7 oj7Var = new oj7();
        LinkedHashMap linkedHashMap = (LinkedHashMap) oj7Var.a;
        if (application != null) {
            linkedHashMap.put(phc.I, application);
        }
        linkedHashMap.put(fhd.a, this);
        linkedHashMap.put(fhd.b, this);
        Bundle bundle = this.f;
        if (bundle != null) {
            linkedHashMap.put(fhd.c, bundle);
        }
        return oj7Var;
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
    public final rhc f() {
        if (this.K != null) {
            if (o() != 1) {
                HashMap hashMap = this.K.O.d;
                rhc rhcVar = (rhc) hashMap.get(this.e);
                if (rhcVar == null) {
                    rhc rhcVar2 = new rhc();
                    hashMap.put(this.e, rhcVar2);
                    return rhcVar2;
                }
                return rhcVar;
            }
            grb.i("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        grb.i("Can't access ViewModels from detached fragment");
        return null;
    }

    @Override
    public final po g() {
        return (po) this.h0.d;
    }

    public ane h() {
        return new sf3(this);
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
        gp4 gp4Var = this.h;
        if (gp4Var == null) {
            kq4 kq4Var = this.K;
            if (kq4Var != null && (str2 = this.n) != null) {
                gp4Var = kq4Var.c.o(str2);
            } else {
                gp4Var = null;
            }
        }
        if (gp4Var != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(gp4Var);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.r);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        fp4 fp4Var = this.Z;
        if (fp4Var == null) {
            z = false;
        } else {
            z = fp4Var.a;
        }
        printWriter.println(z);
        fp4 fp4Var2 = this.Z;
        if (fp4Var2 == null) {
            i = 0;
        } else {
            i = fp4Var2.b;
        }
        if (i != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            fp4 fp4Var3 = this.Z;
            if (fp4Var3 == null) {
                i7 = 0;
            } else {
                i7 = fp4Var3.b;
            }
            printWriter.println(i7);
        }
        fp4 fp4Var4 = this.Z;
        if (fp4Var4 == null) {
            i2 = 0;
        } else {
            i2 = fp4Var4.c;
        }
        if (i2 != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            fp4 fp4Var5 = this.Z;
            if (fp4Var5 == null) {
                i6 = 0;
            } else {
                i6 = fp4Var5.c;
            }
            printWriter.println(i6);
        }
        fp4 fp4Var6 = this.Z;
        if (fp4Var6 == null) {
            i3 = 0;
        } else {
            i3 = fp4Var6.d;
        }
        if (i3 != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            fp4 fp4Var7 = this.Z;
            if (fp4Var7 == null) {
                i5 = 0;
            } else {
                i5 = fp4Var7.d;
            }
            printWriter.println(i5);
        }
        fp4 fp4Var8 = this.Z;
        if (fp4Var8 == null) {
            i4 = 0;
        } else {
            i4 = fp4Var8.e;
        }
        if (i4 != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            fp4 fp4Var9 = this.Z;
            if (fp4Var9 != null) {
                i8 = fp4Var9.e;
            }
            printWriter.println(i8);
        }
        if (this.W != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.W);
        }
        if (n() != null) {
            new ym4(this, f()).w(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.M + ":");
        this.M.w(str.concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final fp4 j() {
        fp4 fp4Var = this.Z;
        if (fp4Var == null) {
            ?? obj = new Object();
            Object obj2 = k0;
            obj.f = obj2;
            obj.g = obj2;
            obj.h = obj2;
            obj.i = null;
            this.Z = obj;
            return obj;
        }
        return fp4Var;
    }

    public final jp4 k() {
        ip4 ip4Var = this.L;
        if (ip4Var == null) {
            return null;
        }
        return (jp4) ip4Var.a;
    }

    public final kq4 l() {
        if (this.L != null) {
            return this.M;
        }
        xi4.j(this, " has not been attached yet.", "Fragment ");
        return null;
    }

    @Override
    public final k36 m() {
        return this.e0;
    }

    public final Context n() {
        ip4 ip4Var = this.L;
        if (ip4Var == null) {
            return null;
        }
        return ip4Var.b;
    }

    public final int o() {
        z26 z26Var = this.d0;
        if (z26Var != z26.b && this.N != null) {
            return Math.min(z26Var.ordinal(), this.N.o());
        }
        return z26Var.ordinal();
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        this.V = true;
    }

    @Override
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        jp4 k = k();
        if (k != null) {
            k.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        } else {
            xi4.j(this, " not attached to an activity.", "Fragment ");
        }
    }

    @Override
    public final void onLowMemory() {
        this.V = true;
    }

    public final kq4 p() {
        kq4 kq4Var = this.K;
        if (kq4Var != null) {
            return kq4Var;
        }
        xi4.j(this, " not associated with a fragment manager.", "Fragment ");
        return null;
    }

    public final String q(int i) {
        return K().getResources().getString(i);
    }

    public final void r() {
        this.e0 = new k36(this);
        this.h0 = new rx(this);
        this.g0 = null;
        ArrayList arrayList = this.i0;
        dp4 dp4Var = this.j0;
        if (!arrayList.contains(dp4Var)) {
            if (this.a >= 0) {
                dp4Var.a();
            } else {
                arrayList.add(dp4Var);
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
        this.M = new kq4();
        this.L = null;
        this.O = 0;
        this.P = 0;
        this.Q = null;
        this.R = false;
        this.S = false;
    }

    public final void startActivityForResult(Intent intent, int i) {
        if (this.L != null) {
            kq4 p = p();
            if (p.C != null) {
                String str = this.e;
                ?? obj = new Object();
                obj.a = str;
                obj.b = i;
                p.F.addLast(obj);
                p.C.a(intent);
                return;
            }
            ip4 ip4Var = p.w;
            ip4Var.getClass();
            intent.getClass();
            if (i == -1) {
                ip4Var.b.startActivity(intent, null);
                return;
            } else {
                grb.i("Starting activity with a requestCode requires a FragmentActivity host");
                return;
            }
        }
        xi4.j(this, " not attached to Activity", "Fragment ");
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
                gp4 gp4Var = this.N;
                if (gp4Var == null) {
                    u = false;
                } else {
                    u = gp4Var.u();
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
        if (kq4.K(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void y(Context context) {
        Activity activity;
        this.V = true;
        ip4 ip4Var = this.L;
        if (ip4Var == null) {
            activity = null;
        } else {
            activity = ip4Var.a;
        }
        if (activity != null) {
            this.V = true;
        }
    }

    public void z(Bundle bundle) {
        this.V = true;
        L();
        lq4 lq4Var = this.M;
        if (lq4Var.v >= 1) {
            return;
        }
        lq4Var.H = false;
        lq4Var.I = false;
        lq4Var.O.g = false;
        lq4Var.u(1);
    }

    public void G(Bundle bundle) {
    }
}
