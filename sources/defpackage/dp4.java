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
public abstract class dp4 implements ComponentCallbacks, View.OnCreateContextMenuListener, e36, ufc, me5, es9 {
    public static final Object k0 = new Object();
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public hq4 K;
    public fp4 L;
    public dp4 N;
    public int O;
    public int P;
    public String Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean V;
    public ViewGroup W;
    public boolean X;
    public cp4 Z;
    public boolean a0;
    public Bundle b;
    public boolean b0;
    public SparseArray c;
    public String c0;
    public Bundle d;
    public v26 d0;
    public g36 e0;
    public Bundle f;
    public final kj7 f0;
    public fs9 g0;
    public dp4 h;
    public ry h0;
    public final ArrayList i0;
    public final ap4 j0;
    public int r;
    public boolean w;
    public boolean x;
    public boolean y;
    public int a = -1;
    public String e = UUID.randomUUID().toString();
    public String n = null;
    public Boolean s = null;
    public iq4 M = new hq4();
    public final boolean U = true;
    public boolean Y = true;

    public dp4() {
        new o04(this, (byte) 6);
        this.d0 = v26.e;
        this.f0 = new kj7();
        this.i0 = new ArrayList();
        this.j0 = new ap4(this);
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
        fp4 fp4Var = this.L;
        if (fp4Var != null) {
            gp4 gp4Var = fp4Var.e;
            LayoutInflater cloneInContext = gp4Var.getLayoutInflater().cloneInContext(gp4Var);
            cloneInContext.setFactory2(this.M.f);
            return cloneInContext;
        }
        dq9.m("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
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
        zo4.i(this, " not attached to a context.", "Fragment ");
        return null;
    }

    public final void L() {
        Bundle bundle;
        Bundle bundle2 = this.b;
        if (bundle2 != null && (bundle = bundle2.getBundle("childFragmentManager")) != null) {
            this.M.X(bundle);
            iq4 iq4Var = this.M;
            iq4Var.H = false;
            iq4Var.I = false;
            iq4Var.O.g = false;
            iq4Var.u(1);
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
        hq4 hq4Var = this.K;
        if (hq4Var != null) {
            if (hq4Var == null) {
                P = false;
            } else {
                P = hq4Var.P();
            }
            if (P) {
                dq9.m("Fragment already added and state has been saved");
                return;
            }
        }
        this.f = bundle;
    }

    @Override
    public final sfc c() {
        Application application = null;
        if (this.K != null) {
            fs9 fs9Var = this.g0;
            if (fs9Var == null) {
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
                if (application == null && hq4.K(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + K().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                fs9 fs9Var2 = new fs9(application, this, this.f);
                this.g0 = fs9Var2;
                return fs9Var2;
            }
            return fs9Var;
        }
        dq9.m("Can't access ViewModels from detached fragment");
        return null;
    }

    @Override
    public final ij7 d() {
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
        if (application == null && hq4.K(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + K().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        ij7 ij7Var = new ij7();
        LinkedHashMap linkedHashMap = (LinkedHashMap) ij7Var.a;
        if (application != null) {
            linkedHashMap.put(rfc.I, application);
        }
        linkedHashMap.put(oed.a, this);
        linkedHashMap.put(oed.b, this);
        Bundle bundle = this.f;
        if (bundle != null) {
            linkedHashMap.put(oed.c, bundle);
        }
        return ij7Var;
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
    public final tfc f() {
        if (this.K != null) {
            if (o() != 1) {
                HashMap hashMap = this.K.O.d;
                tfc tfcVar = (tfc) hashMap.get(this.e);
                if (tfcVar == null) {
                    tfc tfcVar2 = new tfc();
                    hashMap.put(this.e, tfcVar2);
                    return tfcVar2;
                }
                return tfcVar;
            }
            dq9.m("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        dq9.m("Can't access ViewModels from detached fragment");
        return null;
    }

    @Override
    public final op g() {
        return (op) this.h0.d;
    }

    public jke h() {
        return new lg3(this);
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
        dp4 dp4Var = this.h;
        if (dp4Var == null) {
            hq4 hq4Var = this.K;
            if (hq4Var != null && (str2 = this.n) != null) {
                dp4Var = hq4Var.c.n(str2);
            } else {
                dp4Var = null;
            }
        }
        if (dp4Var != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(dp4Var);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.r);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        cp4 cp4Var = this.Z;
        if (cp4Var == null) {
            z = false;
        } else {
            z = cp4Var.a;
        }
        printWriter.println(z);
        cp4 cp4Var2 = this.Z;
        if (cp4Var2 == null) {
            i = 0;
        } else {
            i = cp4Var2.b;
        }
        if (i != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            cp4 cp4Var3 = this.Z;
            if (cp4Var3 == null) {
                i7 = 0;
            } else {
                i7 = cp4Var3.b;
            }
            printWriter.println(i7);
        }
        cp4 cp4Var4 = this.Z;
        if (cp4Var4 == null) {
            i2 = 0;
        } else {
            i2 = cp4Var4.c;
        }
        if (i2 != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            cp4 cp4Var5 = this.Z;
            if (cp4Var5 == null) {
                i6 = 0;
            } else {
                i6 = cp4Var5.c;
            }
            printWriter.println(i6);
        }
        cp4 cp4Var6 = this.Z;
        if (cp4Var6 == null) {
            i3 = 0;
        } else {
            i3 = cp4Var6.d;
        }
        if (i3 != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            cp4 cp4Var7 = this.Z;
            if (cp4Var7 == null) {
                i5 = 0;
            } else {
                i5 = cp4Var7.d;
            }
            printWriter.println(i5);
        }
        cp4 cp4Var8 = this.Z;
        if (cp4Var8 == null) {
            i4 = 0;
        } else {
            i4 = cp4Var8.e;
        }
        if (i4 != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            cp4 cp4Var9 = this.Z;
            if (cp4Var9 != null) {
                i8 = cp4Var9.e;
            }
            printWriter.println(i8);
        }
        if (this.W != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.W);
        }
        if (n() != null) {
            new mj4(this, f()).j(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.M + ":");
        this.M.w(str.concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final cp4 j() {
        cp4 cp4Var = this.Z;
        if (cp4Var == null) {
            ?? obj = new Object();
            Object obj2 = k0;
            obj.f = obj2;
            obj.g = obj2;
            obj.h = obj2;
            obj.i = null;
            this.Z = obj;
            return obj;
        }
        return cp4Var;
    }

    public final gp4 k() {
        fp4 fp4Var = this.L;
        if (fp4Var == null) {
            return null;
        }
        return (gp4) fp4Var.a;
    }

    public final hq4 l() {
        if (this.L != null) {
            return this.M;
        }
        zo4.i(this, " has not been attached yet.", "Fragment ");
        return null;
    }

    @Override
    public final g36 m() {
        return this.e0;
    }

    public final Context n() {
        fp4 fp4Var = this.L;
        if (fp4Var == null) {
            return null;
        }
        return fp4Var.b;
    }

    public final int o() {
        v26 v26Var = this.d0;
        if (v26Var != v26.b && this.N != null) {
            return Math.min(v26Var.ordinal(), this.N.o());
        }
        return v26Var.ordinal();
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        this.V = true;
    }

    @Override
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        gp4 k = k();
        if (k != null) {
            k.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        } else {
            zo4.i(this, " not attached to an activity.", "Fragment ");
        }
    }

    @Override
    public final void onLowMemory() {
        this.V = true;
    }

    public final hq4 p() {
        hq4 hq4Var = this.K;
        if (hq4Var != null) {
            return hq4Var;
        }
        zo4.i(this, " not associated with a fragment manager.", "Fragment ");
        return null;
    }

    public final String q(int i) {
        return K().getResources().getString(i);
    }

    public final void r() {
        this.e0 = new g36(this);
        this.h0 = new ry(this);
        this.g0 = null;
        ArrayList arrayList = this.i0;
        ap4 ap4Var = this.j0;
        if (!arrayList.contains(ap4Var)) {
            if (this.a >= 0) {
                ap4Var.a();
            } else {
                arrayList.add(ap4Var);
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
        this.M = new hq4();
        this.L = null;
        this.O = 0;
        this.P = 0;
        this.Q = null;
        this.R = false;
        this.S = false;
    }

    public final void startActivityForResult(Intent intent, int i) {
        if (this.L != null) {
            hq4 p = p();
            if (p.C != null) {
                String str = this.e;
                ?? obj = new Object();
                obj.a = str;
                obj.b = i;
                p.F.addLast(obj);
                p.C.a(intent);
                return;
            }
            fp4 fp4Var = p.w;
            fp4Var.getClass();
            intent.getClass();
            if (i == -1) {
                fp4Var.b.startActivity(intent, null);
                return;
            } else {
                dq9.m("Starting activity with a requestCode requires a FragmentActivity host");
                return;
            }
        }
        zo4.i(this, " not attached to Activity", "Fragment ");
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
                dp4 dp4Var = this.N;
                if (dp4Var == null) {
                    u = false;
                } else {
                    u = dp4Var.u();
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
        if (hq4.K(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void y(Context context) {
        Activity activity;
        this.V = true;
        fp4 fp4Var = this.L;
        if (fp4Var == null) {
            activity = null;
        } else {
            activity = fp4Var.a;
        }
        if (activity != null) {
            this.V = true;
        }
    }

    public void z(Bundle bundle) {
        this.V = true;
        L();
        iq4 iq4Var = this.M;
        if (iq4Var.v >= 1) {
            return;
        }
        iq4Var.H = false;
        iq4Var.I = false;
        iq4Var.O.g = false;
        iq4Var.u(1);
    }

    public void G(Bundle bundle) {
    }
}
