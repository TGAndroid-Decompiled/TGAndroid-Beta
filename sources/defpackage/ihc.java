package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
public abstract class ihc {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final int[] d = {2131296272, 2131296273, 2131296284, 2131296295, 2131296298, 2131296299, 2131296300, 2131296301, 2131296302, 2131296303, 2131296274, 2131296275, 2131296276, 2131296277, 2131296278, 2131296279, 2131296280, 2131296281, 2131296282, 2131296283, 2131296285, 2131296286, 2131296287, 2131296288, 2131296289, 2131296290, 2131296291, 2131296292, 2131296293, 2131296294, 2131296296, 2131296297};
    public static final vgc e = new Object();
    public static final xgc f = new xgc();

    public static zic a(View view) {
        WeakHashMap weakHashMap = a;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            a = weakHashMap;
        }
        zic zicVar = (zic) weakHashMap.get(view);
        if (zicVar == null) {
            zic zicVar2 = new zic(view);
            a.put(view, zicVar2);
            return zicVar2;
        }
        return zicVar;
    }

    public static l2d b(View view, l2d l2dVar) {
        WindowInsets a2;
        WindowInsets g = l2dVar.g();
        if (g != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                a2 = fhc.a(view, g);
            } else {
                a2 = ygc.a(view, g);
            }
            if (!a2.equals(g)) {
                return l2d.h(view, a2);
            }
        }
        return l2dVar;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = hhc.d;
            hhc hhcVar = (hhc) view.getTag(2131296696);
            hhc hhcVar2 = hhcVar;
            if (hhcVar == null) {
                ?? obj = new Object();
                obj.a = null;
                obj.b = null;
                obj.c = null;
                view.setTag(2131296696, obj);
                hhcVar2 = obj;
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = hhcVar2.a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = hhc.d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        if (hhcVar2.a == null) {
                            hhcVar2.a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = hhc.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                hhcVar2.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    hhcVar2.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    }
                }
            }
            View a2 = hhcVar2.a(view);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                    SparseArray sparseArray = hhcVar2.b;
                    if (sparseArray == null) {
                        sparseArray = new SparseArray();
                        hhcVar2.b = sparseArray;
                    }
                    sparseArray.put(keyCode, new WeakReference(a2));
                }
            }
            if (a2 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean d(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = hhc.d;
            hhc hhcVar = (hhc) view.getTag(2131296696);
            WeakReference weakReference = null;
            hhc hhcVar2 = hhcVar;
            if (hhcVar == null) {
                ?? obj = new Object();
                obj.a = null;
                obj.b = null;
                obj.c = null;
                view.setTag(2131296696, obj);
                hhcVar2 = obj;
            }
            WeakReference weakReference2 = hhcVar2.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                hhcVar2.c = new WeakReference(keyEvent);
                SparseArray sparseArray = hhcVar2.b;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    hhcVar2.b = sparseArray;
                }
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(2131296697)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    grb.o();
                    return false;
                }
            }
        }
        return false;
    }

    public static View.AccessibilityDelegate e(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return ehc.a(view);
        }
        if (!c) {
            if (b == null) {
                try {
                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    b = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable unused) {
                    c = true;
                    return null;
                }
            }
            try {
                Object obj = b.get(view);
                if (obj instanceof View.AccessibilityDelegate) {
                    return (View.AccessibilityDelegate) obj;
                }
                return null;
            } catch (Throwable unused2) {
                c = true;
                return null;
            }
        }
        return null;
    }

    public static ArrayList f(im7 im7Var) {
        ArrayList arrayList = (ArrayList) im7Var.getTag(2131296684);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            im7Var.setTag(2131296684, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static String[] g(ip ipVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            return ghc.a(ipVar);
        }
        return (String[]) ipVar.getTag(2131296691);
    }

    public static void h(int i, View view) {
        Object tag;
        boolean z;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i2 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            if (i2 >= 28) {
                tag = dhc.a(view);
            } else {
                tag = view.getTag(2131296687);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            if (((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            int i3 = 32;
            if (view.getAccessibilityLiveRegion() == 0 && !z) {
                if (i == 32) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    view.onInitializeAccessibilityEvent(obtain);
                    obtain.setEventType(32);
                    obtain.setContentChangeTypes(i);
                    obtain.setSource(view);
                    view.onPopulateAccessibilityEvent(obtain);
                    List<CharSequence> text = obtain.getText();
                    if (i2 >= 28) {
                        charSequence = dhc.a(view);
                    } else {
                        Object tag2 = view.getTag(2131296687);
                        if (CharSequence.class.isInstance(tag2)) {
                            charSequence = tag2;
                        }
                    }
                    text.add(charSequence);
                    accessibilityManager.sendAccessibilityEvent(obtain);
                    return;
                } else if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                } else {
                    return;
                }
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            if (!z) {
                i3 = 2048;
            }
            obtain2.setEventType(i3);
            obtain2.setContentChangeTypes(i);
            if (z) {
                List<CharSequence> text2 = obtain2.getText();
                if (i2 >= 28) {
                    charSequence = dhc.a(view);
                } else {
                    Object tag3 = view.getTag(2131296687);
                    if (CharSequence.class.isInstance(tag3)) {
                        charSequence = tag3;
                    }
                }
                text2.add(charSequence);
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
            }
            view.sendAccessibilityEventUnchecked(obtain2);
        }
    }

    public static l2d i(View view, l2d l2dVar) {
        WindowInsets g = l2dVar.g();
        if (g != null) {
            WindowInsets b2 = ygc.b(view, g);
            if (!b2.equals(g)) {
                return l2d.h(view, b2);
            }
        }
        return l2dVar;
    }

    public static bw2 j(View view, bw2 bw2Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + bw2Var + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return ghc.b(view, bw2Var);
        }
        vmb vmbVar = (vmb) view.getTag(2131296690);
        fs7 fs7Var = e;
        if (vmbVar != null) {
            bw2 a2 = vmb.a(view, bw2Var);
            if (a2 == null) {
                return null;
            }
            if (view instanceof fs7) {
                fs7Var = (fs7) view;
            }
            return fs7Var.a(a2);
        }
        if (view instanceof fs7) {
            fs7Var = (fs7) view;
        }
        return fs7Var.a(bw2Var);
    }

    public static void k(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            ehc.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void l(View view, r4 r4Var) {
        q4 q4Var;
        if (r4Var == null && (e(view) instanceof q4)) {
            r4Var = new r4();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        if (r4Var == null) {
            q4Var = null;
        } else {
            q4Var = r4Var.b;
        }
        view.setAccessibilityDelegate(q4Var);
    }

    public static void m(View view, CharSequence charSequence) {
        boolean z;
        new wgc(2131296687, CharSequence.class, 8, 28, (byte) 1).a(view, charSequence);
        xgc xgcVar = f;
        if (charSequence != null) {
            WeakHashMap weakHashMap = xgcVar.a;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(xgcVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(xgcVar);
                return;
            }
            return;
        }
        xgcVar.a.remove(view);
        view.removeOnAttachStateChangeListener(xgcVar);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(xgcVar);
    }
}
