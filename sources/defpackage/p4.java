package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
public final class p4 extends View.AccessibilityDelegate {
    public final q4 a;

    public p4(q4 q4Var) {
        this.a = q4Var;
    }

    @Override
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        ni6 a = this.a.a(view);
        if (a != null) {
            return (AccessibilityNodeProvider) a.b;
        }
        return null;
    }

    @Override
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.b(view, accessibilityEvent);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        boolean z;
        Object tag2;
        Object tag3;
        Object obj;
        int i;
        u4 u4Var = new u4(accessibilityNodeInfo);
        WeakHashMap weakHashMap = kfc.a;
        ClickableSpan[] clickableSpanArr = null;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = Boolean.valueOf(ffc.c(view));
        } else {
            tag = view.getTag(2131296692);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        boolean z2 = true;
        if (bool != null && bool.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        u4Var.n(z);
        if (Build.VERSION.SDK_INT >= 28) {
            tag2 = Boolean.valueOf(ffc.b(view));
        } else {
            tag2 = view.getTag(2131296686);
            if (!Boolean.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        Boolean bool2 = (Boolean) tag2;
        u4Var.k((bool2 == null || !bool2.booleanValue()) ? false : false);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            tag3 = ffc.a(view);
        } else {
            tag3 = view.getTag(2131296687);
            if (!CharSequence.class.isInstance(tag3)) {
                tag3 = null;
            }
        }
        u4Var.m((CharSequence) tag3);
        if (i2 >= 30) {
            obj = hfc.b(view);
        } else {
            Object tag4 = view.getTag(2131296693);
            if (CharSequence.class.isInstance(tag4)) {
                obj = tag4;
            } else {
                obj = null;
            }
        }
        CharSequence charSequence = (CharSequence) obj;
        if (i2 >= 30) {
            via.v(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.a.c(view, u4Var);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i2 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(2131296685);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                    if (((WeakReference) sparseArray.valueAt(i3)).get() == null) {
                        arrayList.add(Integer.valueOf(i3));
                    }
                }
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    sparseArray.remove(((Integer) arrayList.get(i4)).intValue());
                }
            }
            if (text instanceof Spanned) {
                clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
            }
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", 2131296271);
                SparseArray sparseArray2 = (SparseArray) view.getTag(2131296685);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(2131296685, sparseArray2);
                }
                for (int i5 = 0; i5 < clickableSpanArr.length; i5++) {
                    ClickableSpan clickableSpan = clickableSpanArr[i5];
                    int i6 = 0;
                    while (true) {
                        if (i6 < sparseArray2.size()) {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i6)).get())) {
                                i = sparseArray2.keyAt(i6);
                                break;
                            }
                            i6++;
                        } else {
                            i = u4.c;
                            u4.c = i + 1;
                            break;
                        }
                    }
                    sparseArray2.put(i, new WeakReference(clickableSpanArr[i5]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i5];
                    Spanned spanned = (Spanned) text;
                    u4Var.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    u4Var.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    u4Var.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    u4Var.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                }
            }
        }
        List list = (List) view.getTag(2131296684);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            u4Var.b((r4) list.get(i7));
        }
    }

    @Override
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.a.d(view, i, bundle);
    }

    @Override
    public final void sendAccessibilityEvent(View view, int i) {
        this.a.a.sendAccessibilityEvent(view, i);
    }

    @Override
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.a.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
