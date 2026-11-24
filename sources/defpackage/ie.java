package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;
public class ie extends dq implements DialogInterface {
    public final sd f;

    public ie(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, e(contextThemeWrapper, i));
        this.f = new sd(getContext(), this, getWindow());
    }

    public static int e(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968615, typedValue, true);
        return typedValue.resourceId;
    }

    @Override
    public void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        ListAdapter listAdapter;
        int i2;
        int i3;
        View view;
        View findViewById;
        super.onCreate(bundle);
        sd sdVar = this.f;
        sdVar.b.setContentView(sdVar.u);
        Context context = sdVar.a;
        Window window = sdVar.c;
        View findViewById2 = window.findViewById(2131296592);
        View findViewById3 = findViewById2.findViewById(2131296724);
        View findViewById4 = findViewById2.findViewById(2131296404);
        View findViewById5 = findViewById2.findViewById(2131296355);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(2131296408);
        View view2 = sdVar.f;
        if (view2 == null) {
            view2 = null;
        }
        int i4 = 0;
        if (view2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !sd.a(view2)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(2131296407);
            frameLayout.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (sdVar.g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (sdVar.e != null) {
                ((LinearLayout.LayoutParams) ((o46) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(2131296724);
        View findViewById7 = viewGroup.findViewById(2131296404);
        View findViewById8 = viewGroup.findViewById(2131296355);
        ViewGroup b = sd.b(findViewById6, findViewById3);
        ViewGroup b2 = sd.b(findViewById7, findViewById4);
        ViewGroup b3 = sd.b(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(2131296633);
        sdVar.m = nestedScrollView;
        nestedScrollView.setFocusable(false);
        sdVar.m.setNestedScrollingEnabled(false);
        TextView textView = (TextView) b2.findViewById(16908299);
        sdVar.q = textView;
        if (textView != null) {
            textView.setVisibility(8);
            sdVar.m.removeView(sdVar.q);
            if (sdVar.e != null) {
                ViewGroup viewGroup2 = (ViewGroup) sdVar.m.getParent();
                int indexOfChild = viewGroup2.indexOfChild(sdVar.m);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(sdVar.e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                b2.setVisibility(8);
            }
        }
        Button button = (Button) b3.findViewById(16908313);
        sdVar.h = button;
        g6 g6Var = sdVar.A;
        button.setOnClickListener(g6Var);
        sdVar.h.setVisibility(8);
        Button button2 = (Button) b3.findViewById(16908314);
        sdVar.i = button2;
        button2.setOnClickListener(g6Var);
        boolean isEmpty = TextUtils.isEmpty(sdVar.j);
        Button button3 = sdVar.i;
        if (isEmpty) {
            button3.setVisibility(8);
            z2 = false;
        } else {
            button3.setText(sdVar.j);
            sdVar.i.setVisibility(0);
            z2 = true;
        }
        Button button4 = (Button) b3.findViewById(16908315);
        sdVar.l = button4;
        button4.setOnClickListener(g6Var);
        sdVar.l.setVisibility(8);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968613, typedValue, true);
        if (typedValue.data != 0) {
            if (z2) {
                Button button5 = sdVar.h;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button5.setLayoutParams(layoutParams);
            } else if (z2) {
                Button button6 = sdVar.i;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button6.setLayoutParams(layoutParams2);
            }
        }
        if (!z2) {
            b3.setVisibility(8);
        }
        if (sdVar.r != null) {
            b.addView(sdVar.r, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(2131296718).setVisibility(8);
        } else {
            sdVar.o = (ImageView) window.findViewById(16908294);
            if (!TextUtils.isEmpty(sdVar.d) && sdVar.y) {
                TextView textView2 = (TextView) window.findViewById(2131296334);
                sdVar.p = textView2;
                textView2.setText(sdVar.d);
                Drawable drawable = sdVar.n;
                if (drawable != null) {
                    sdVar.o.setImageDrawable(drawable);
                } else {
                    sdVar.p.setPadding(sdVar.o.getPaddingLeft(), sdVar.o.getPaddingTop(), sdVar.o.getPaddingRight(), sdVar.o.getPaddingBottom());
                    sdVar.o.setVisibility(8);
                }
            } else {
                window.findViewById(2131296718).setVisibility(8);
                sdVar.o.setVisibility(8);
                b.setVisibility(8);
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (b != null && b.getVisibility() != 8) {
            i = 1;
        } else {
            i = 0;
        }
        if (b3.getVisibility() != 8) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 && (findViewById = b2.findViewById(2131296706)) != null) {
            findViewById.setVisibility(0);
        }
        if (i != 0) {
            NestedScrollView nestedScrollView2 = sdVar.m;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (sdVar.e != null) {
                view = b.findViewById(2131296717);
            } else {
                view = null;
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else {
            View findViewById9 = b2.findViewById(2131296707);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = sdVar.e;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z4 || i == 0) {
                int paddingLeft = alertController$RecycleListView.getPaddingLeft();
                if (i != 0) {
                    i2 = alertController$RecycleListView.getPaddingTop();
                } else {
                    i2 = alertController$RecycleListView.a;
                }
                int paddingRight = alertController$RecycleListView.getPaddingRight();
                if (z4) {
                    i3 = alertController$RecycleListView.getPaddingBottom();
                } else {
                    i3 = alertController$RecycleListView.b;
                }
                alertController$RecycleListView.setPadding(paddingLeft, i2, paddingRight, i3);
            }
        }
        if (!z3) {
            View view3 = sdVar.e;
            if (view3 == null) {
                view3 = sdVar.m;
            }
            if (view3 != null) {
                if (z4) {
                    i4 = 2;
                }
                View findViewById10 = window.findViewById(2131296632);
                View findViewById11 = window.findViewById(2131296631);
                WeakHashMap weakHashMap = kfc.a;
                dfc.b(view3, i | i4, 3);
                if (findViewById10 != null) {
                    b2.removeView(findViewById10);
                }
                if (findViewById11 != null) {
                    b2.removeView(findViewById11);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = sdVar.e;
        if (alertController$RecycleListView2 != null && (listAdapter = sdVar.s) != null) {
            alertController$RecycleListView2.setAdapter(listAdapter);
            int i5 = sdVar.t;
            if (i5 > -1) {
                alertController$RecycleListView2.setItemChecked(i5, true);
                alertController$RecycleListView2.setSelection(i5);
            }
        }
    }

    @Override
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.m;
        if (nestedScrollView != null && nestedScrollView.h(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.m;
        if (nestedScrollView != null && nestedScrollView.h(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        sd sdVar = this.f;
        sdVar.d = charSequence;
        TextView textView = sdVar.p;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
