package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
public final class kp9 extends e {
    public static final int[] d = {750000, 1000000, 1200000, 2000000};
    public final byte a;
    public d79 b;
    public c79 c;

    public kp9(Bundle bundle, byte b) {
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
            im0 im0Var = phd.b;
            boolean z = !MediaController.v0(this.currentAccount);
            synchronized (im0Var) {
                im0Var.d = z;
                im0Var.c = true;
                im0Var.b = true;
                zba.a.edit().putBoolean("audio_recorder_v2_enabled", z).apply();
            }
            ((t20) this.c).f();
        } else if (MediaController.v0(this.currentAccount) && i == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.S = ob6.M0(2131753915, null);
            alertDialog$Builder.e(new CharSequence[]{ob6.M0(2131753914, null), ob6.M0(2131753913, null)}, new s20(this, (byte) 0));
            showDialog(alertDialog$Builder.a);
        }
    }

    public final void c0(int i, CharSequence[] charSequenceArr, iy8 iy8Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = ob6.M0(i, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        alertDialog$Builder.e(charSequenceArr, new oh(this, iy8Var, (byte) 10));
        showDialog(idVar);
    }

    @Override
    public final View createView(Context context) {
        switch (this.a) {
            case 0:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(2131231243);
                this.simpleActionBar.setTitle(ob6.M0(2131745712, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 11));
                FrameLayout frameLayout = new FrameLayout(context);
                this.fragmentView = frameLayout;
                d79 d79Var = new d79(context, null);
                this.b = d79Var;
                d79Var.s1();
                this.b.setSectionsDrawBackground(true);
                this.b.setLayoutManager(new x46());
                this.b.setVerticalScrollBarEnabled(false);
                d79 d79Var2 = this.b;
                ox0 ox0Var = new ox0(context);
                this.c = ox0Var;
                d79Var2.setAdapter(ox0Var);
                this.b.setOnItemClickListener(new t39(this, (byte) 3));
                frameLayout.addView(this.b, tre.c(-1.0f, -1));
                return this.fragmentView;
            default:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(2131231243);
                this.simpleActionBar.setTitle(ob6.M0(2131753912, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 4));
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.fragmentView = frameLayout2;
                d79 d79Var3 = new d79(context, null);
                this.b = d79Var3;
                d79Var3.setSectionsDrawBackground(true);
                this.b.s1();
                this.b.setLayoutManager(new x46());
                this.b.setVerticalScrollBarEnabled(false);
                d79 d79Var4 = this.b;
                t20 t20Var = new t20(this, context, (byte) 0);
                this.c = t20Var;
                d79Var4.setAdapter(t20Var);
                this.b.setOnItemClickListener(new u(this, (byte) 5));
                frameLayout2.addView(this.b, tre.c(-1.0f, -1));
                return this.fragmentView;
        }
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
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
