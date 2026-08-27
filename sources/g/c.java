package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

public final class c implements AdapterView.OnItemClickListener {

    public final f f6225a;

    public final d f6226b;

    public c(d dVar, f fVar) {
        this.f6226b = dVar;
        this.f6225a = fVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        d dVar = this.f6226b;
        DialogInterface.OnClickListener onClickListener = dVar.f6234j;
        f fVar = this.f6225a;
        onClickListener.onClick(fVar.f6239b, i10);
        if (dVar.f6236l) {
            return;
        }
        fVar.f6239b.dismiss();
    }
}
