package bi;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class j1 implements ActionMode.Callback {
    public final n1 f3113a;

    public j1(n1 n1Var) {
        this.f3113a = n1Var;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return false;
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (this.f3113a.length() != 0) {
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

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
    }
}
