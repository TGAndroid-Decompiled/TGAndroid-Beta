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
import m.v1;
import r0.i0;
public class f extends u implements DialogInterface {
    public final e f12988f;

    public f(ContextThemeWrapper contextThemeWrapper, int i7) {
        super(contextThemeWrapper, e(contextThemeWrapper, i7));
        this.f12988f = new e(getContext(), this, getWindow());
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
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        boolean z13;
        ListAdapter listAdapter;
        int i10;
        int i11;
        View view;
        View findViewById;
        super.onCreate(bundle);
        e eVar = this.f12988f;
        eVar.f12966b.setContentView(eVar.f12983u);
        Context context = eVar.f12965a;
        Window window = eVar.f12967c;
        View findViewById2 = window.findViewById(2131296590);
        View findViewById3 = findViewById2.findViewById(2131296722);
        View findViewById4 = findViewById2.findViewById(2131296402);
        View findViewById5 = findViewById2.findViewById(2131296353);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(2131296406);
        View view2 = eVar.f12969f;
        if (view2 == null) {
            view2 = null;
        }
        int i12 = 0;
        if (view2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !e.a(view2)) {
            window.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(2131296405);
            frameLayout.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (eVar.f12970g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (eVar.f12968e != null) {
                ((LinearLayout.LayoutParams) ((v1) viewGroup.getLayoutParams())).weight = 0.0f;
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
        eVar.f12975m = nestedScrollView;
        nestedScrollView.setFocusable(false);
        eVar.f12975m.setNestedScrollingEnabled(false);
        TextView textView = (TextView) b11.findViewById(16908299);
        eVar.f12979q = textView;
        if (textView != null) {
            textView.setVisibility(8);
            eVar.f12975m.removeView(eVar.f12979q);
            if (eVar.f12968e != null) {
                ViewGroup viewGroup2 = (ViewGroup) eVar.f12975m.getParent();
                int indexOfChild = viewGroup2.indexOfChild(eVar.f12975m);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(eVar.f12968e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
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
            z11 = false;
        } else {
            eVar.h.setText((CharSequence) null);
            eVar.h.setVisibility(0);
            z11 = true;
        }
        Button button2 = (Button) b12.findViewById(16908314);
        eVar.f12971i = button2;
        button2.setOnClickListener(wVar);
        if (TextUtils.isEmpty(eVar.f12972j)) {
            eVar.f12971i.setVisibility(8);
        } else {
            eVar.f12971i.setText(eVar.f12972j);
            eVar.f12971i.setVisibility(0);
            z11 |= true;
        }
        Button button3 = (Button) b12.findViewById(16908315);
        eVar.f12974l = button3;
        button3.setOnClickListener(wVar);
        if (TextUtils.isEmpty(null)) {
            eVar.f12974l.setVisibility(8);
        } else {
            eVar.f12974l.setText((CharSequence) null);
            eVar.f12974l.setVisibility(0);
            z11 |= true;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968613, typedValue, true);
        if (typedValue.data != 0) {
            if (z11) {
                Button button4 = eVar.h;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (z11) {
                Button button5 = eVar.f12971i;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (z11) {
                Button button6 = eVar.f12974l;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (!z11) {
            b12.setVisibility(8);
        }
        if (eVar.f12980r != null) {
            b10.addView(eVar.f12980r, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(2131296716).setVisibility(8);
        } else {
            eVar.f12977o = (ImageView) window.findViewById(16908294);
            if (!TextUtils.isEmpty(eVar.d) && eVar.f12986y) {
                TextView textView2 = (TextView) window.findViewById(2131296332);
                eVar.f12978p = textView2;
                textView2.setText(eVar.d);
                Drawable drawable = eVar.f12976n;
                if (drawable != null) {
                    eVar.f12977o.setImageDrawable(drawable);
                } else {
                    eVar.f12978p.setPadding(eVar.f12977o.getPaddingLeft(), eVar.f12977o.getPaddingTop(), eVar.f12977o.getPaddingRight(), eVar.f12977o.getPaddingBottom());
                    eVar.f12977o.setVisibility(8);
                }
            } else {
                window.findViewById(2131296716).setVisibility(8);
                eVar.f12977o.setVisibility(8);
                b10.setVisibility(8);
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (b10 != null && b10.getVisibility() != 8) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (b12.getVisibility() != 8) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13 && (findViewById = b11.findViewById(2131296704)) != null) {
            findViewById.setVisibility(0);
        }
        if (i7 != 0) {
            NestedScrollView nestedScrollView2 = eVar.f12975m;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (eVar.f12968e != null) {
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
        AlertController$RecycleListView alertController$RecycleListView = eVar.f12968e;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z13 || i7 == 0) {
                int paddingLeft = alertController$RecycleListView.getPaddingLeft();
                if (i7 != 0) {
                    i10 = alertController$RecycleListView.getPaddingTop();
                } else {
                    i10 = alertController$RecycleListView.f1830a;
                }
                int paddingRight = alertController$RecycleListView.getPaddingRight();
                if (z13) {
                    i11 = alertController$RecycleListView.getPaddingBottom();
                } else {
                    i11 = alertController$RecycleListView.f1831b;
                }
                alertController$RecycleListView.setPadding(paddingLeft, i10, paddingRight, i11);
            }
        }
        if (!z12) {
            View view3 = eVar.f12968e;
            if (view3 == null) {
                view3 = eVar.f12975m;
            }
            if (view3 != null) {
                if (z13) {
                    i12 = 2;
                }
                View findViewById10 = window.findViewById(2131296630);
                View findViewById11 = window.findViewById(2131296629);
                WeakHashMap weakHashMap = i0.f56244a;
                r0.b0.b(view3, i7 | i12, 3);
                if (findViewById10 != null) {
                    b11.removeView(findViewById10);
                }
                if (findViewById11 != null) {
                    b11.removeView(findViewById11);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = eVar.f12968e;
        if (alertController$RecycleListView2 != null && (listAdapter = eVar.f12981s) != null) {
            alertController$RecycleListView2.setAdapter(listAdapter);
            int i13 = eVar.f12982t;
            if (i13 > -1) {
                alertController$RecycleListView2.setItemChecked(i13, true);
                alertController$RecycleListView2.setSelection(i13);
            }
        }
    }

    @Override
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f12988f.f12975m;
        if (nestedScrollView != null && nestedScrollView.g(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override
    public boolean onKeyUp(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f12988f.f12975m;
        if (nestedScrollView != null && nestedScrollView.g(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i7, keyEvent);
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e eVar = this.f12988f;
        eVar.d = charSequence;
        TextView textView = eVar.f12978p;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
