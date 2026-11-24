package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
public final class vl9 extends d {
    public static final int[] d = {750000, 1000000, 1200000, 2000000};
    public final byte a;
    public o39 b;
    public n39 c;

    public vl9(Bundle bundle, byte b) {
        super(bundle);
        this.a = b;
    }

    public static String a0(int i) {
        if (i % 1000000 == 0) {
            return (i / 1000000) + " Mbps";
        } else if (i > 1000000) {
            return String.format(Locale.US, "%.1f Mbps", Float.valueOf(i / 1000000.0f));
        } else {
            return (i / 1000) + " kbps";
        }
    }

    public final void b0(int i) {
        if (i == 1) {
            im0 im0Var = wcd.b;
            boolean z = !MediaController.r0(this.currentAccount);
            synchronized (im0Var) {
                im0Var.d = z;
                im0Var.c = true;
                im0Var.b = true;
                j8a.a.edit().putBoolean("audio_recorder_v2_enabled", z).apply();
            }
            ((s20) this.c).f();
        } else if (MediaController.r0(this.currentAccount) && i == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.S = k96.M0(2131753919, null);
            alertDialog$Builder.e(new CharSequence[]{k96.M0(2131753918, null), k96.M0(2131753917, null)}, new r20(this, (byte) 0));
            showDialog(alertDialog$Builder.a);
        }
    }

    public final void c0(int i, CharSequence[] charSequenceArr, sc8 sc8Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = k96.M0(i, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        alertDialog$Builder.e(charSequenceArr, new fe(this, sc8Var, (byte) 10));
        showDialog(hdVar);
    }

    @Override
    public final View createView(Context context) {
        switch (this.a) {
            case 0:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(2131231243);
                this.simpleActionBar.setTitle(k96.M0(2131745792, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new kk8(this, (byte) 9));
                FrameLayout frameLayout = new FrameLayout(context);
                this.fragmentView = frameLayout;
                o39 o39Var = new o39(context, null);
                this.b = o39Var;
                o39Var.r1();
                this.b.setSectionsDrawBackground(true);
                this.b.setLayoutManager(new t26());
                this.b.setVerticalScrollBarEnabled(false);
                o39 o39Var2 = this.b;
                gx0 gx0Var = new gx0(context);
                this.c = gx0Var;
                o39Var2.setAdapter(gx0Var);
                this.b.setOnItemClickListener(new f09(this, (byte) 3));
                frameLayout.addView(this.b, nme.c(-1.0f, -1));
                return this.fragmentView;
            default:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(2131231243);
                this.simpleActionBar.setTitle(k96.M0(2131753916, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 4));
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.fragmentView = frameLayout2;
                o39 o39Var3 = new o39(context, null);
                this.b = o39Var3;
                o39Var3.setSectionsDrawBackground(true);
                this.b.r1();
                this.b.setLayoutManager(new t26());
                this.b.setVerticalScrollBarEnabled(false);
                o39 o39Var4 = this.b;
                s20 s20Var = new s20(this, context, (byte) 0);
                this.c = s20Var;
                o39Var4.setAdapter(s20Var);
                this.b.setOnItemClickListener(new u(this, (byte) 5));
                frameLayout2.addView(this.b, nme.c(-1.0f, -1));
                return this.fragmentView;
        }
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        byte b = this.a;
        return true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        byte b = this.a;
        return true;
    }
}
