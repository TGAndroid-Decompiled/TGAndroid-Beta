package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class a implements AdapterView.OnItemClickListener {
    public final e f10616a;
    public final b f10617b;

    public a(b bVar, e eVar) {
        this.f10617b = bVar;
        this.f10616a = eVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        b bVar = this.f10617b;
        DialogInterface.OnClickListener onClickListener = bVar.f10645j;
        e eVar = this.f10616a;
        onClickListener.onClick(eVar.f10652b, i10);
        if (!bVar.f10647l) {
            eVar.f10652b.dismiss();
        }
    }
}
