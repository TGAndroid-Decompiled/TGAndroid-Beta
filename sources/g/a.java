package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class a implements AdapterView.OnItemClickListener {
    public final e f10073a;
    public final b f10074b;

    public a(b bVar, e eVar) {
        this.f10074b = bVar;
        this.f10073a = eVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        b bVar = this.f10074b;
        DialogInterface.OnClickListener onClickListener = bVar.f10104j;
        e eVar = this.f10073a;
        onClickListener.onClick(eVar.f10111b, i10);
        if (!bVar.f10106l) {
            eVar.f10111b.dismiss();
        }
    }
}
