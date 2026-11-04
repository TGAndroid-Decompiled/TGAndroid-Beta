package m;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
public final class j0 implements ListAdapter, SpinnerAdapter {
    public SpinnerAdapter f18616a;
    public ListAdapter f18617b;

    @Override
    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.f18617b;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    @Override
    public final int getCount() {
        SpinnerAdapter spinnerAdapter = this.f18616a;
        if (spinnerAdapter == null) {
            return 0;
        }
        return spinnerAdapter.getCount();
    }

    @Override
    public final View getDropDownView(int i3, View view, ViewGroup viewGroup) {
        SpinnerAdapter spinnerAdapter = this.f18616a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(i3, view, viewGroup);
    }

    @Override
    public final Object getItem(int i3) {
        SpinnerAdapter spinnerAdapter = this.f18616a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(i3);
    }

    @Override
    public final long getItemId(int i3) {
        SpinnerAdapter spinnerAdapter = this.f18616a;
        if (spinnerAdapter == null) {
            return -1L;
        }
        return spinnerAdapter.getItemId(i3);
    }

    @Override
    public final int getItemViewType(int i3) {
        return 0;
    }

    @Override
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        return getDropDownView(i3, view, viewGroup);
    }

    @Override
    public final int getViewTypeCount() {
        return 1;
    }

    @Override
    public final boolean hasStableIds() {
        SpinnerAdapter spinnerAdapter = this.f18616a;
        if (spinnerAdapter != null && spinnerAdapter.hasStableIds()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEmpty() {
        if (getCount() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEnabled(int i3) {
        ListAdapter listAdapter = this.f18617b;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i3);
        }
        return true;
    }

    @Override
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f18616a;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f18616a;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
