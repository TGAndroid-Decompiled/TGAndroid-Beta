package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class a implements AdapterView.OnItemClickListener {
    public final e f10615a;
    public final b f10616b;

    public a(b bVar, e eVar) {
        this.f10616b = bVar;
        this.f10615a = eVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        b bVar = this.f10616b;
        DialogInterface.OnClickListener onClickListener = bVar.f10644j;
        e eVar = this.f10615a;
        onClickListener.onClick(eVar.f10651b, i10);
        if (!bVar.f10646l) {
            eVar.f10651b.dismiss();
        }
    }
}
