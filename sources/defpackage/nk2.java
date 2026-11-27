package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class nk2 implements ActionMode.Callback {
    public final byte a;
    public final EditTextBoldCursor b;

    public nk2(EditTextBoldCursor editTextBoldCursor, byte b) {
        this.a = b;
        this.b = editTextBoldCursor;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        bk2 bk2Var;
        ClipboardManager clipboardManager;
        ClipData primaryClip;
        int i;
        switch (this.a) {
            case 0:
                ok2 ok2Var = (ok2) this.b;
                if (menuItem.getItemId() == 16908322) {
                    if (ok2Var.getParent() instanceof bk2) {
                        bk2Var = (bk2) ok2Var.getParent();
                    } else {
                        bk2Var = null;
                    }
                    if (bk2Var != null && (clipboardManager = (ClipboardManager) ok2Var.getContext().getSystemService(ClipboardManager.class)) != null && (primaryClip = clipboardManager.getPrimaryClip()) != null) {
                        String charSequence = primaryClip.getItemAt(0).getText().toString();
                        try {
                            i = Integer.parseInt(charSequence);
                        } catch (Exception unused) {
                            i = -1;
                        }
                        if (i > 0) {
                            bk2Var.c(charSequence, true);
                        }
                    }
                    ok2Var.m();
                }
                return true;
            default:
                return false;
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.a) {
            case 0:
                menu.add(0, 16908322, 0, 17039371);
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        byte b = this.a;
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        switch (this.a) {
            case 0:
                return true;
            default:
                if (((dg9) this.b).length() != 0) {
                    return false;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    int itemId = menu.getItem(size).getItemId();
                    if (itemId != 16908322 && itemId != 16908337) {
                        menu.removeItem(itemId);
                    }
                }
                return true;
        }
    }

    private final void a(ActionMode actionMode) {
    }

    private final void b(ActionMode actionMode) {
    }
}
