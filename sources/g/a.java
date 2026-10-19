package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class a implements AdapterView.OnItemClickListener {
    public final e f10617a;
    public final b f10618b;

    public a(b bVar, e eVar) {
        this.f10618b = bVar;
        this.f10617a = eVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        b bVar = this.f10618b;
        DialogInterface.OnClickListener onClickListener = bVar.f10646j;
        e eVar = this.f10617a;
        onClickListener.onClick(eVar.f10653b, i10);
        if (!bVar.f10648l) {
            eVar.f10653b.dismiss();
        }
    }
}
