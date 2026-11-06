package m;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
public final class k0 implements ListAdapter, SpinnerAdapter {
    public SpinnerAdapter f19144a;
    public ListAdapter f19145b;

    @Override
    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.f19145b;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    @Override
    public final int getCount() {
        SpinnerAdapter spinnerAdapter = this.f19144a;
        if (spinnerAdapter == null) {
            return 0;
        }
        return spinnerAdapter.getCount();
    }

    @Override
    public final View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        SpinnerAdapter spinnerAdapter = this.f19144a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(i7, view, viewGroup);
    }

    @Override
    public final Object getItem(int i7) {
        SpinnerAdapter spinnerAdapter = this.f19144a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(i7);
    }

    @Override
    public final long getItemId(int i7) {
        SpinnerAdapter spinnerAdapter = this.f19144a;
        if (spinnerAdapter == null) {
            return -1L;
        }
        return spinnerAdapter.getItemId(i7);
    }

    @Override
    public final int getItemViewType(int i7) {
        return 0;
    }

    @Override
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        return getDropDownView(i7, view, viewGroup);
    }

    @Override
    public final int getViewTypeCount() {
        return 1;
    }

    @Override
    public final boolean hasStableIds() {
        SpinnerAdapter spinnerAdapter = this.f19144a;
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
    public final boolean isEnabled(int i7) {
        ListAdapter listAdapter = this.f19145b;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i7);
        }
        return true;
    }

    @Override
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f19144a;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f19144a;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
