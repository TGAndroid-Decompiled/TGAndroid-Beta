package m;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
public abstract class b0 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        r0.d dVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                dVar = new j2.j(clipData, 3);
            } else {
                r0.e eVar = new r0.e();
                eVar.f44677b = clipData;
                eVar.f44678c = 3;
                dVar = eVar;
            }
            r0.i0.i(textView, dVar.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th2) {
            textView.endBatchEdit();
            throw th2;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        r0.d dVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            dVar = new j2.j(clipData, 3);
        } else {
            r0.e eVar = new r0.e();
            eVar.f44677b = clipData;
            eVar.f44678c = 3;
            dVar = eVar;
        }
        r0.i0.i(view, dVar.build());
        return true;
    }
}
