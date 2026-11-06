package g;

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
import m.w1;
import r0.i0;
public class f extends u implements DialogInterface {
    public final e f13321f;

    public f(ContextThemeWrapper contextThemeWrapper, int i7) {
        super(contextThemeWrapper, e(contextThemeWrapper, i7));
        this.f13321f = new e(getContext(), this, getWindow());
    }

    public static int e(Context context, int i7) {
        if (((i7 >>> 24) & 255) >= 1) {
            return i7;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968615, typedValue, true);
        return typedValue.resourceId;
    }

    @Override
    public void onCreate(Bundle bundle) {
        boolean z9;
        boolean z10;
        boolean z11;
        int i7;
        boolean z12;
        ListAdapter listAdapter;
        int i10;
        int i11;
        View view;
        View findViewById;
        super.onCreate(bundle);
        e eVar = this.f13321f;
        eVar.f13299b.setContentView(eVar.f13316u);
        Context context = eVar.f13298a;
        Window window = eVar.f13300c;
        View findViewById2 = window.findViewById(2131296590);
        View findViewById3 = findViewById2.findViewById(2131296722);
        View findViewById4 = findViewById2.findViewById(2131296402);
        View findViewById5 = findViewById2.findViewById(2131296353);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(2131296406);
        View view2 = eVar.f13302f;
        if (view2 == null) {
            view2 = null;
        }
        int i12 = 0;
        if (view2 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 || !e.a(view2)) {
            window.setFlags(131072, 131072);
        }
        if (z9) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(2131296405);
            frameLayout.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (eVar.f13303g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (eVar.f13301e != null) {
                ((LinearLayout.LayoutParams) ((w1) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(2131296722);
        View findViewById7 = viewGroup.findViewById(2131296402);
        View findViewById8 = viewGroup.findViewById(2131296353);
        ViewGroup b10 = e.b(findViewById6, findViewById3);
        ViewGroup b11 = e.b(findViewById7, findViewById4);
        ViewGroup b12 = e.b(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(2131296631);
        eVar.f13308m = nestedScrollView;
        nestedScrollView.setFocusable(false);
        eVar.f13308m.setNestedScrollingEnabled(false);
        TextView textView = (TextView) b11.findViewById(16908299);
        eVar.f13312q = textView;
        if (textView != null) {
            textView.setVisibility(8);
            eVar.f13308m.removeView(eVar.f13312q);
            if (eVar.f13301e != null) {
                ViewGroup viewGroup2 = (ViewGroup) eVar.f13308m.getParent();
                int indexOfChild = viewGroup2.indexOfChild(eVar.f13308m);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(eVar.f13301e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                b11.setVisibility(8);
            }
        }
        Button button = (Button) b12.findViewById(16908313);
        eVar.h = button;
        androidx.mediarouter.app.w wVar = eVar.A;
        button.setOnClickListener(wVar);
        if (TextUtils.isEmpty(null)) {
            eVar.h.setVisibility(8);
            z10 = false;
        } else {
            eVar.h.setText((CharSequence) null);
            eVar.h.setVisibility(0);
            z10 = true;
        }
        Button button2 = (Button) b12.findViewById(16908314);
        eVar.f13304i = button2;
        button2.setOnClickListener(wVar);
        if (TextUtils.isEmpty(eVar.f13305j)) {
            eVar.f13304i.setVisibility(8);
        } else {
            eVar.f13304i.setText(eVar.f13305j);
            eVar.f13304i.setVisibility(0);
            z10 |= true;
        }
        Button button3 = (Button) b12.findViewById(16908315);
        eVar.f13307l = button3;
        button3.setOnClickListener(wVar);
        if (TextUtils.isEmpty(null)) {
            eVar.f13307l.setVisibility(8);
        } else {
            eVar.f13307l.setText((CharSequence) null);
            eVar.f13307l.setVisibility(0);
            z10 |= true;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968613, typedValue, true);
        if (typedValue.data != 0) {
            if (z10) {
                Button button4 = eVar.h;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (z10) {
                Button button5 = eVar.f13304i;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (z10) {
                Button button6 = eVar.f13307l;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (!z10) {
            b12.setVisibility(8);
        }
        if (eVar.f13313r != null) {
            b10.addView(eVar.f13313r, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(2131296716).setVisibility(8);
        } else {
            eVar.f13310o = (ImageView) window.findViewById(16908294);
            if (!TextUtils.isEmpty(eVar.d) && eVar.f13319y) {
                TextView textView2 = (TextView) window.findViewById(2131296332);
                eVar.f13311p = textView2;
                textView2.setText(eVar.d);
                Drawable drawable = eVar.f13309n;
                if (drawable != null) {
                    eVar.f13310o.setImageDrawable(drawable);
                } else {
                    eVar.f13311p.setPadding(eVar.f13310o.getPaddingLeft(), eVar.f13310o.getPaddingTop(), eVar.f13310o.getPaddingRight(), eVar.f13310o.getPaddingBottom());
                    eVar.f13310o.setVisibility(8);
                }
            } else {
                window.findViewById(2131296716).setVisibility(8);
                eVar.f13310o.setVisibility(8);
                b10.setVisibility(8);
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (b10 != null && b10.getVisibility() != 8) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (b12.getVisibility() != 8) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12 && (findViewById = b11.findViewById(2131296704)) != null) {
            findViewById.setVisibility(0);
        }
        if (i7 != 0) {
            NestedScrollView nestedScrollView2 = eVar.f13308m;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (eVar.f13301e != null) {
                view = b10.findViewById(2131296715);
            } else {
                view = null;
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else {
            View findViewById9 = b11.findViewById(2131296705);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = eVar.f13301e;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z12 || i7 == 0) {
                int paddingLeft = alertController$RecycleListView.getPaddingLeft();
                if (i7 != 0) {
                    i10 = alertController$RecycleListView.getPaddingTop();
                } else {
                    i10 = alertController$RecycleListView.f1889a;
                }
                int paddingRight = alertController$RecycleListView.getPaddingRight();
                if (z12) {
                    i11 = alertController$RecycleListView.getPaddingBottom();
                } else {
                    i11 = alertController$RecycleListView.f1890b;
                }
                alertController$RecycleListView.setPadding(paddingLeft, i10, paddingRight, i11);
            }
        }
        if (!z11) {
            View view3 = eVar.f13301e;
            if (view3 == null) {
                view3 = eVar.f13308m;
            }
            if (view3 != null) {
                if (z12) {
                    i12 = 2;
                }
                View findViewById10 = window.findViewById(2131296630);
                View findViewById11 = window.findViewById(2131296629);
                WeakHashMap weakHashMap = i0.f54098a;
                r0.b0.b(view3, i7 | i12, 3);
                if (findViewById10 != null) {
                    b11.removeView(findViewById10);
                }
                if (findViewById11 != null) {
                    b11.removeView(findViewById11);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = eVar.f13301e;
        if (alertController$RecycleListView2 != null && (listAdapter = eVar.f13314s) != null) {
            alertController$RecycleListView2.setAdapter(listAdapter);
            int i13 = eVar.f13315t;
            if (i13 > -1) {
                alertController$RecycleListView2.setItemChecked(i13, true);
                alertController$RecycleListView2.setSelection(i13);
            }
        }
    }

    @Override
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f13321f.f13308m;
        if (nestedScrollView != null && nestedScrollView.f(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override
    public boolean onKeyUp(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f13321f.f13308m;
        if (nestedScrollView != null && nestedScrollView.f(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i7, keyEvent);
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e eVar = this.f13321f;
        eVar.d = charSequence;
        TextView textView = eVar.f13311p;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
