package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class a implements AdapterView.OnItemClickListener {
    public final e f10071a;
    public final b f10072b;

    public a(b bVar, e eVar) {
        this.f10072b = bVar;
        this.f10071a = eVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        b bVar = this.f10072b;
        DialogInterface.OnClickListener onClickListener = bVar.f10102j;
        e eVar = this.f10071a;
        onClickListener.onClick(eVar.f10109b, i10);
        if (!bVar.f10104l) {
            eVar.f10109b.dismiss();
        }
    }
}
