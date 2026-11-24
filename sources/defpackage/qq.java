package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
public abstract class qq {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        nw2 nw2Var;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                nw2Var = new mw2(clipData, 3);
            } else {
                ow2 ow2Var = new ow2();
                ow2Var.b = clipData;
                ow2Var.c = (byte) 3;
                nw2Var = ow2Var;
            }
            kfc.i(textView, nw2Var.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        nw2 nw2Var;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            nw2Var = new mw2(clipData, 3);
        } else {
            ow2 ow2Var = new ow2();
            ow2Var.b = clipData;
            ow2Var.c = (byte) 3;
            nw2Var = ow2Var;
        }
        kfc.i(view, nw2Var.build());
        return true;
    }
}
