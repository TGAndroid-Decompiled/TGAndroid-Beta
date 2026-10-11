package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class a implements AdapterView.OnItemClickListener {
    public final e f10072a;
    public final b f10073b;

    public a(b bVar, e eVar) {
        this.f10073b = bVar;
        this.f10072a = eVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        b bVar = this.f10073b;
        DialogInterface.OnClickListener onClickListener = bVar.f10103j;
        e eVar = this.f10072a;
        onClickListener.onClick(eVar.f10110b, i10);
        if (!bVar.f10105l) {
            eVar.f10110b.dismiss();
        }
    }
}
