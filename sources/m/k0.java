package m;

import android.content.res.Resources;
import android.database.DataSetObserver;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
public final class k0 implements ListAdapter, SpinnerAdapter {
    public final SpinnerAdapter f16588a;
    public final ListAdapter f16589b;

    public k0(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
        this.f16588a = spinnerAdapter;
        if (spinnerAdapter instanceof ListAdapter) {
            this.f16589b = (ListAdapter) spinnerAdapter;
        }
        if (theme != null && Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
            i0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
        }
    }

    @Override
    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.f16589b;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    @Override
    public final int getCount() {
        SpinnerAdapter spinnerAdapter = this.f16588a;
        if (spinnerAdapter == null) {
            return 0;
        }
        return spinnerAdapter.getCount();
    }

    @Override
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        SpinnerAdapter spinnerAdapter = this.f16588a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(i10, view, viewGroup);
    }

    @Override
    public final Object getItem(int i10) {
        SpinnerAdapter spinnerAdapter = this.f16588a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(i10);
    }

    @Override
    public final long getItemId(int i10) {
        SpinnerAdapter spinnerAdapter = this.f16588a;
        if (spinnerAdapter == null) {
            return -1L;
        }
        return spinnerAdapter.getItemId(i10);
    }

    @Override
    public final int getItemViewType(int i10) {
        return 0;
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        return getDropDownView(i10, view, viewGroup);
    }

    @Override
    public final int getViewTypeCount() {
        return 1;
    }

    @Override
    public final boolean hasStableIds() {
        SpinnerAdapter spinnerAdapter = this.f16588a;
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
    public final boolean isEnabled(int i10) {
        ListAdapter listAdapter = this.f16589b;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i10);
        }
        return true;
    }

    @Override
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f16588a;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f16588a;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
