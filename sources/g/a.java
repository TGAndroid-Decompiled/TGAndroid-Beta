package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class a implements AdapterView.OnItemClickListener {
    public final e f10618a;
    public final b f10619b;

    public a(b bVar, e eVar) {
        this.f10619b = bVar;
        this.f10618a = eVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        b bVar = this.f10619b;
        DialogInterface.OnClickListener onClickListener = bVar.f10647j;
        e eVar = this.f10618a;
        onClickListener.onClick(eVar.f10654b, i10);
        if (!bVar.f10649l) {
            eVar.f10654b.dismiss();
        }
    }
}
